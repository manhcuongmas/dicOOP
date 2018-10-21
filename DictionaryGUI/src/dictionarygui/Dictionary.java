/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarygui;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Dictionary {
   static ArrayList<Word>listWord = new ArrayList<Word>();
   
  public void insertFromFile(){
  
      BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("dictionary.txt"));
			String line = br.readLine();
			while(line != null) {
				
				if(line.indexOf("\t") == -1) {
					
					line = br.readLine();
					continue;
				}
                            String[] words = line.split("\t");
                            Word wd = new Word(words[0], words[1], words[2], words[3], words[4],words[5]);
                            Dictionary.listWord.add(wd);
                            line = br.readLine();
                            
			}
			br.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
  
     }
  public static void ListExportToFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dictionary.txt"), "UTF-8"));
            for (Word ele : Dictionary.listWord) {
                bw.write(ele.EnglishWord+ "\t" + ele.Explain + "\t" + ele.transcription + "\t" + ele.Example + "\t" + ele.explainExample + "\t" + ele.kindofWord);
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
  
  
  

   
}
