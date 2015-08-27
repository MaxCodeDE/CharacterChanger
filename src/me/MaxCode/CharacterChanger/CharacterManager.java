package me.MaxCode.CharacterChanger;

public class CharacterManager {

	
	public static boolean isUmlaut(char buchstabe) {
		
		boolean isUmlaut = false;
		
		if (buchstabe == 'ä') {
			isUmlaut = true;
		} else if (buchstabe == 'ü') {
			isUmlaut = true;
		} else if (buchstabe == 'ö') {
			isUmlaut = true;
		}
		
		return isUmlaut;
		
	}
	
	
	
	public static String chanceUmlautToString(char buchstabe) {
		
		String buchstabeNeu = null;
		
		if (buchstabe == 'ä') {
			buchstabeNeu = "ae";
		} else if (buchstabe == 'ü') {
			buchstabeNeu = "ue";
		} else if (buchstabe == 'ö') {
			buchstabeNeu = "oe";
		}
		
		return buchstabeNeu;
		
	}
	
	
	
	
}
