package FINALS_CASE_STUDY;
import java.util.Scanner;
import javax.print.attribute.standard.MediaSize.Other;
public class FINALS_CASESTUDY_POS {

	public static void main(String[] args) {
		Scanner kced = new Scanner(System.in);
        String inputCode;
        int totalAmount = 0, counter = 0;
        String productCode[] = {"CC", "S", "JR", "D", "NFA"};
        String description[] = {"Coco Pandan", "Sinandomeng", "Jasmine Rice", "Dinorado", "NFA Rice"};
        double ricePrice[] = {60, 44, 62, 42, 30};
        int quantities[] = new int[productCode.length]; 

        String newCustomer = "y";
        while (newCustomer.equals("y")) {
            System.out.println("      KC JOHN'S BIGASAN        ");
            System.out.println("       Mandaluyong City        ");
            System.out.println("     PRODUCT INFORMATION       ");
            System.out.println("                               ");
            System.out.println("Code  Description    RicePrice ");
            
            for (int i = 0; i < productCode.length; i++) {
                System.out.printf("%-6s %-15s ₱%.1f%n", productCode[i], description[i], ricePrice[i]);
            }
            System.out.println("---------------------------------");

            System.out.println("Purchase Rice? (y/n)?");
            String input = kced.nextLine();
            
            while (input.equalsIgnoreCase(newCustomer)) {
                if (counter >= 5) {
                    System.out.println("OUT OF PRODUCTS");
                    break;
                }
                
                System.out.println("Please Enter Product Code: ");
                inputCode = kced.nextLine();
   
                
                
                int productIndex =0;
                
                switch (inputCode) {
                    case "CC":
                        productIndex = 0;
                        break;
                    case "S":
                        productIndex = 1;
                        break;
                    case "JR":
                        productIndex = 2;
                        break;
                    case "D":
                        productIndex = 3;
                        break;
                    case "NFA":
                        productIndex = 4;
                        break;
                    default:                       
                     System.out.println("Product code not found");
                        break;
                }

                if (productIndex != -1) {
                    System.out.println("Enter kilo: ");
                    int quantity = kced.nextInt();
                    quantities[productIndex] += quantity; 
                    totalAmount += quantity * ricePrice[productIndex];
                    System.out.println("           KC JOHN'S BIGASAN      ");
                    System.out.println("            Mandaluyong City     ");
                    System.out.println("             PURCHASE ORDER        ");
                    System.out.println("                                    ");
                    System.out.println("Selected product code: " + inputCode);
                    System.out.println("Kilo: " + quantity);
                    System.out.println("Amount: ₱" + quantity * ricePrice[productIndex]);
                } else {
                    System.out.println("Invalid Product Code.");
                }

                
                System.out.println("Add Rice? (y/n)?");
                kced.nextLine();
                input = kced.nextLine();
                counter++;
            }

            System.out.println("                KC JOHN'S BIGASAN   ");
            System.out.println("                   Mandaluyong City         ");
            System.out.println("                  ORDER INFORMATION        ");
            System.out.println("                                ");
            System.out.println("Code  Description    RicePrice   Kilo     Amount");

            for (int i = 0; i < productCode.length; i++) {
                if (quantities[i] > 0) { 
                    System.out.printf("%-6s %-15s ₱%.1f      %-9d ₱%.1f%n",
                            productCode[i], description[i], ricePrice[i], quantities[i], quantities[i] * ricePrice[i]);
                }
            }
        
            System.out.println("------------------nothing follows-------------------------");
            System.out.println("                                       GRAND TOTAL ₱" + totalAmount);
            System.out.println("----------------------------------------------------------");

            
            totalAmount = 0;
            counter = 0;
            quantities = new int[productCode.length];

            System.out.println("New customer? (y/n)?");
            newCustomer = kced.nextLine();
        }
        kced.close(); 
    }
}
		
		

		
		
		
		
		
		
		
	


