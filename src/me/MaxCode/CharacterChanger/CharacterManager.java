package me.MaxCode.CharacterChanger;

public class CharacterManager {

	
	public static boolean isUmlaut(char buchstabe) {
		
		boolean isUmlaut = false;
		
		if (buchstabe == '�') {
			isUmlaut = true;
		} else if (buchstabe == '�') {
			isUmlaut = true;
		} else if (buchstabe == '�') {
			isUmlaut = true;
		}
		
		return isUmlaut;
		
	}
	
	
	
	public static String chanceUmlautToString(char buchstabe) {
		
		String buchstabeNeu = null;
		
		if (buchstabe == '�') {
			buchstabeNeu = "ae";
		} else if (buchstabe == '�') {
			buchstabeNeu = "ue";
		} else if (buchstabe == '�') {
			buchstabeNeu = "oe";
		}
		
		return buchstabeNeu;
		
	}
	
	
	
	
}
