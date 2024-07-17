package Midterm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Midterm_CaseStudy {

	public static void main(String[] args) {
		//initialize variables
	int dailywage = 0;
	double amelioration = 0;
		
		
		//Ask the recipient 
String Recipient = JOptionPane.showInputDialog(null, "Enter recipient Name: ");
String Region = JOptionPane.showInputDialog(null, "Enter your Region: ");
int ps = JOptionPane.showConfirmDialog(new JFrame(), "Are you a 4P's recipient? ", "Choose one",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		//Perform calculation
if ( ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("NCR")) {
	 amelioration = 6650;
	 dailywage = 537;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("CAR")) {
	amelioration = 4150;
	dailywage = 350;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("I")) {
	amelioration = 4150;
	dailywage = 340;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("II")) {
	amelioration = 4150;
	dailywage = 370;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("III")) {
	amelioration = 5150;
	dailywage = 420;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("IV-A")) {
	amelioration = 5150;
	dailywage = 400;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("IV-B")) {
	amelioration = 3650;
	dailywage = 350;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("V")) {
	amelioration = 3650;
	dailywage = 310;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("VI")) {
	amelioration = 4650;
	dailywage = 395;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("VII")) {
	amelioration = 4650;
	dailywage = 404;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("VIII")) {
	amelioration = 3650;
	dailywage = 315;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("IX")) {
	amelioration = 3650;
	dailywage = 316;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("X")) {
	amelioration = 4650;
	dailywage = 365;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("XI")) {
	amelioration = 4650;
	dailywage = 396;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("XII")) {
	amelioration = 3650;
	dailywage = 326;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("CARAGA")) {
	amelioration = 3650;
	dailywage = 320;
} else if (ps == JOptionPane.YES_OPTION && Region.equalsIgnoreCase("BARMM")) {
	amelioration = 3650;
	dailywage = 325;
} 
	
if ( ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("NCR")) {
		 amelioration = 8000;
		 dailywage = 537;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("CAR")) {
		amelioration = 5500;
		dailywage = 350;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("I")) {
		amelioration = 5500;
		dailywage = 340;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("II")) {
		amelioration = 5500;
		dailywage = 370;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("III")) {
		amelioration = 6500;
		dailywage = 420;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("IV-A")) {
		amelioration = 6500;
		dailywage = 400;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("IV-B")) {
		amelioration = 5000;
		dailywage = 350;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("V")) {
		amelioration = 5000;
		dailywage = 310;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("VI")) {
		amelioration = 6000;
		dailywage = 395;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("VII")) {
		amelioration = 6000;
		dailywage = 404;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("VIII")) {
		amelioration = 5000;
		dailywage = 315;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("IX")) {
		amelioration = 5000;
		dailywage = 316;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("X")) {
		amelioration = 6000;
		dailywage = 365;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("XI")) {
		amelioration = 6000;
		dailywage = 396;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("XII")) {
		amelioration = 5000;
		dailywage = 326;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("CARAGA")) {
		amelioration = 5000;
		dailywage = 320;
} else if (ps == JOptionPane.NO_OPTION && Region.equalsIgnoreCase("BARMM")) {
		amelioration = 5000;
		dailywage = 325;
} else { 
	JOptionPane.showMessageDialog(null, "Input Invalid! ", "Warning", JOptionPane.WARNING_MESSAGE);
}


 {
	
}



	
		
}
	}
