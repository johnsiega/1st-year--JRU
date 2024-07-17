package Midterm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MID_TERM_CASE_STUDY {

	public static void main(String[] args) {
		
	//INITIALIZE
		
		int dailywage = 0;
		int amelioration = 0;
		boolean is4ps = false;
		
			
	//Ask the recipient 
	String Recipient = JOptionPane.showInputDialog(null, "Enter recipient Name: ");
	String Region = JOptionPane.showInputDialog(null, "Enter your Region: ");
	int ps = JOptionPane.showConfirmDialog(new JFrame(), "Are you a 4P's recipient? ", "Choose one",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
			
	is4ps = ps == JOptionPane.YES_OPTION;
	
	
	//COMPUTATION of Table 1
switch (Region.toUpperCase()) {
	case "NCR": 
		amelioration = is4ps ? 6650 : 8000;
		 dailywage = 537;
		 break;
	case "CAR":
	 	amelioration = is4ps ? 4150 : 5500;
	 	dailywage = 350;
	 	break;
	case "I":
		amelioration = is4ps ? 4150 : 5500;
		dailywage = 340;
		break;
	case "II":
		amelioration = is4ps ? 4150 : 5500;
		dailywage = 370;
		break;
	case "III":
		amelioration = is4ps ? 5150 : 6500;
		dailywage = 420;
		break;
	case "IV-A":
		amelioration = is4ps ? 5150 : 6500 ;
		dailywage = 400;
		break;
	case "IV-B":
		amelioration = is4ps ? 3650 : 5000;
		dailywage = 320;
		break;
	case "V":
		amelioration = is4ps ? 3650 : 5000;
	 	dailywage = 310;
	 	break;
	case "VI":
		amelioration = is4ps ? 4650 : 6000;
		dailywage = 395;
		break;
	case "VII":
		amelioration = is4ps ? 3650 : 6000;
		dailywage = 404;
		break;
	case "VIII":
		amelioration = is4ps ? 3650 : 5000;
		dailywage = 315;
		break;
	case "IX":
		amelioration = is4ps ? 3650 : 5000;
		dailywage = 316;
		break;
	case "x":
		amelioration = is4ps ? 4650 : 6000;
		dailywage = 365;
		break;
	case "XI":
		amelioration = is4ps ? 4650 : 6000;
		dailywage = 396;
		break;
	case "XII":
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
			JOptionPane.showMessageDialog(null, "Invalid region name!", "Warning", JOptionPane.WARNING_MESSAGE); }
	
	
	 //DISPLAY OUTPUT 

   JOptionPane.showMessageDialog(null, "Name: " + Recipient + "\nIs a Member of 4Ps:  " + is4ps + "\nRegion: " + Region + "\nAmelioration Amount: " + amelioration + "\nDaily Wage: " + dailywage  , "Results", JOptionPane.INFORMATION_MESSAGE);
		
	
}
}
