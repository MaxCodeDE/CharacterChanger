package me.MaxCode.CharacterChanger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	

	public static String getText(String fileName) {
		
		String inhalt = null;
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
            String zeile = null; 
            while ((zeile = br.readLine()) != null) { 
                //System.out.println("Gelesene Zeile: " + zeile); 
                
                if (inhalt != null) {
                	inhalt = inhalt + CharacterChanger.umbruch + zeile;
                } else {
                	inhalt = zeile;
                }
                
            } 
            
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return inhalt;
	}
	
	
	
	public static void saveTextToFile(String fileName, String inhalt) {
		
		
		try {
			FileWriter fw = new FileWriter(fileName);
			
			fw.write(inhalt);
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
