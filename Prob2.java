package Midterm;

import javax.swing.JOptionPane;
public class Prob2 {

	public static void main(String[] args) {
		//Initialize variable
		int amelioration = 0;
		int dailywage = 0;
		int SAP = 0;
		boolean is4ps = false;
		
		//Ask recipient name
		String name = JOptionPane.showInputDialog(null, "Enter recipient Name: ","What is The Recipient's Name",JOptionPane.QUESTION_MESSAGE);
		
		//Display Menu Option
		String[] regions = {"NCR", "CAR", "Region I", "Region II", "Region III", "Region IV-A", "Region IV-B", "Region V","Region VI","Region VII", "Region VIII", "Region IX", "Regoion X", "Region XI", "Region XII", "Region CARAGA", "Region BARMM" };
        int regionChoice = JOptionPane.showOptionDialog(null, "Select a region:", "Region Selection",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, regions, regions[0]);
        // Display second menu for 4Ps membership
        int ps = JOptionPane.showConfirmDialog(null, "Are you a 4P's recipient? ", "Choose one",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);			
    	is4ps = ps == JOptionPane.YES_OPTION;
        
        //Calculate SAP
 switch (regions[regionChoice]) {
        case "NCR":
        	amelioration = is4ps ? 6650 : 8000;
       		dailywage = 537;
       		break;
       	case "CAR":
       	 	amelioration = is4ps ? 4150 : 5500;
       	 	dailywage = 350;
       	 	break;
       	case "Region I":
       		amelioration = is4ps ? 4150 : 5500;
       		dailywage = 340;
       		break;
       	case "Region II":
       		amelioration = is4ps ? 4150 : 5500;
       		dailywage = 370;
       		break;
       	case "Region III":
       		amelioration = is4ps ? 5150 : 6500;
       		dailywage = 420;
       		break;
       	case "Region IV-A":
       		amelioration = is4ps ? 5150 : 6500 ;
       		dailywage = 400;
       		break;
       	case "Region IV-B":
       		amelioration = is4ps ? 3650 : 5000;
       		dailywage = 320;
       		break;
       	case "Region V":
       		amelioration = is4ps ? 3650 : 5000;
       	 	dailywage = 310;
       	 	break;
       	case "Region VI":
       		amelioration = is4ps ? 4650 : 6000;
       		dailywage = 395;
       		break;
       	case "Region VII":
       		amelioration = is4ps ? 3650 : 6000;
       		dailywage = 404;
       		break;
       	case "Region VIII":
       		amelioration = is4ps ? 3650 : 5000;
       		dailywage = 315;
       		break;
       	case "Region IX":
       		amelioration = is4ps ? 3650 : 5000;
       		dailywage = 316;
       		break;
       	case "Region X":
       		amelioration = is4ps ? 4650 : 6000;
       		dailywage = 365;
       		break;
       	case "Region XI":
       		amelioration = is4ps ? 4650 : 6000;
       		dailywage = 396;
       		break;
       	case "Region XII":
       		amelioration = is4ps ? 3650 : 5000;
       	 	dailywage = 326;
       	 	break;
       	case "CARAGA":
       		amelioration = is4ps ? 3650 : 5000;
       		dailywage = 320;
       		break;
       	case "BARMM":
       		amelioration = is4ps ? 3650 : 5000;
       		dailywage = 325;
       		break;
       	default:
       			JOptionPane.showMessageDialog(null, "Invalid region name!", "Warning", JOptionPane.WARNING_MESSAGE); 
       			}       	                	

	if (dailywage < 330) {
		SAP = is4ps ? 3650 : 5000;
	}else if (dailywage <= 359) {
		SAP = is4ps ? 4150 : 5500;
	}else if (dailywage <= 399) {
		SAP = is4ps ? 4650 : 6000;
	}else if (dailywage <= 429) {
		SAP = is4ps ? 5150 : 6500;
	}else if (dailywage <= 459) {
		SAP = is4ps ? 5650 : 7000;
	}else if (dailywage <= 499) {
		SAP = is4ps ? 6150 : 7500;
	}else if (dailywage >= 500) {
		SAP = is4ps ? 6650 : 8000;
	}
       
	//DISPLAY OUTPUT 

	   JOptionPane.showMessageDialog(null, "Name: " + name + "\nIs a Member of 4Ps:  " + is4ps + "\nRegion: " + regions[regionChoice] + "\nAmelioration Amount: " + amelioration + "\nDaily Wage: " + dailywage + "\nSAP: " + SAP , "Results", JOptionPane.INFORMATION_MESSAGE);
			
        
        
        
        
        
	}
        
	}


