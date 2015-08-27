package me.MaxCode.CharacterChanger;

import java.io.File;
import java.util.Scanner;

public class CharacterChanger {

	public static String fileName;
	public static int buchstabenGaendert;
	public static String umbruch = System.getProperty("line.separator");
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gebe einen Dateinamen ein: ");
		fileName = scanner.next();
		
		File file = new File(fileName);
		if (file.exists()) {
		
		String inhalt = FileManager.getText(fileName);
		String inhaltNeu = null;
		
		for (int i = 0; i < inhalt.length(); i++) {
			char buchstabe = inhalt.charAt(i);
            System.out.println("Buchstabe an Stelle " + i + " = " + buchstabe);
            
            if (buchstabe != ' ') {
            
	            if (CharacterManager.isUmlaut(buchstabe)) {
	            	
	            	
	            	String buchstabeNeu = CharacterManager.chanceUmlautToString(buchstabe);
	            	if (inhaltNeu != null) {
	            		inhaltNeu = inhaltNeu + buchstabeNeu;
	            	} else {
	            		inhaltNeu = "" + buchstabeNeu;
	            	}
	            	
	            	buchstabenGaendert++;
	            	
	            } else {
	            	
	            	
	            	if (inhaltNeu != null) {
	            		inhaltNeu = inhaltNeu + buchstabe;
	            	} else {
	            		inhaltNeu = "" + buchstabe;
	            	}
	            	
	            	
	            }
	            
            
            } else {
            	inhaltNeu = inhaltNeu + " ";
            }
            
            
		}
		
		FileManager.saveTextToFile(fileName, inhaltNeu);
		
		System.out.println("-----------|Fertig|-----------");
		System.out.println("Keine Fehler!");
		System.out.println("Buchstaben geändert: " + buchstabenGaendert);
		System.out.println("------------------------------");
		
		} else {
			System.out.println("Datei wurde nicht gefunden!");
		}
		
	}
	
	
	
}
