package DicCom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {

	Scanner sc = new Scanner(System.in);
	public void insertFromCommandline() {
		
		
		System.out.print("Enter your num: ");
		
		int num = sc.nextInt(); // nhap so luong tu muon nhap
		sc.nextLine();
		for ( int i = 0 ; i < num ; i++) {
			
			System.out.print("Enter your word you want to add: ");
			
			String spe = sc.nextLine();
			
			boolean check = false; // kiem tra tu dien co spe chua
			
			for(Word ele : Dictionary.dsWord) {
				
				if(ele.getWord_target().equals(spe.trim())) {
					System.out.println("Tu " + spe + " da co trong tu dien");
					check = true;
					i--;
					break;
				
				} 
				
			}
			if(!check) {
				
				System.out.print("Nhap nghia tieng Viet: ");
				
				String expl = sc.nextLine();
				
				Dictionary.dsWord.add(new Word(spe,expl));
				
			}
			
		}
		System.out.println("--successful!--");
	
		
	}
		
		
		
		
		public void dictionaryLookup() {
			
			
			System.out.print("Nhap tu tieng Anh: ");
			String Englishword = sc.nextLine();
			for(Word ele: Dictionary.dsWord) {
				
				if(ele.getWord_target().equals(Englishword)) {
					
					ele.printWord();
					return;
					
				}
			}
			System.out.println("Not Found!");
		
		}
		
		
		
		public void editWord() {
			
			System.out.println("Nhap tu ban muon sua: ");
			String edw = sc.nextLine();
			for(int i = 0 ; i < Dictionary.dsWord.size() ;i++) {
				
				if(Dictionary.dsWord.get(i).getWord_target().equals(edw)) {
					
					System.out.println("da thay tu " + edw);
					System.out.print("Nhap tu tieng anh : ");
					String engword = sc.nextLine();
					System.out.print("Nhap tu tieng viet: ");
					String vietword = sc.nextLine();
					Dictionary.dsWord.set(i, new Word(engword,vietword));
					System.out.println("Sucessful!");
					return;
				}
				
			}
			System.out.println("Khong tim thay: " + edw);
			
		}
		public void deleteWord() {
			
			System.out.println("Nhap tu ban muon xoa: ");
			String delw = sc.nextLine();
			for(int i = 0 ; i < Dictionary.dsWord.size();i++) {
				
				if(Dictionary.dsWord.get(i).getWord_target().equals(delw)) {
					
					System.out.println("Da thay tu " + delw );
					
					System.out.println("Ban chac chan muon xoa?(Y/N)");
					
					char lc = sc.next().charAt(0);
					if(lc == 'y' || lc == 'Y') {
						Dictionary.dsWord.remove(i);
					} else if( lc == 'N' || lc == 'n') {
						
						System.out.println("Khong xoa!");
					}
					else {
						
						System.out.println("nhap sai!");
					}
					return;
					
				}
			}
			System.out.println("Khong tim thay tu: " + delw);
			
		}
		
		
		
		public void dictionaryExportToFile() {
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("dictionaries.txt") ));
				for(Word ele : Dictionary.dsWord) {
					
					bw.write(ele.getWord_target() + "\t" + ele.getWord_explain());
					bw.close();
					
				}
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		

		public void dictionarySearcher() {
			
				
				System.out.print("Nhap tu can tim kiem: ");
			
				String wordsearch = sc.nextLine();
			
				ArrayList<Word> ws = new ArrayList<Word>();
				
				for(Word ele : Dictionary.dsWord) {
					if(ele.getWord_target().indexOf(wordsearch) == 0) {
						
						ws.add(ele);
					}
				}
				
				if(ws.isEmpty()) {
					
					System.out.println("Khong co trong tu dien");
					
				} else {
					System.out.println("Cac tu bat dau bang " + wordsearch + ":" );
					int i = 1;
					for(Word ele : ws) {
						
						System.out.printf("%-4d", i);
						ele.printWord();
						i++;
					}
					
				}
				
		
		}
		
		
		
		
		
		
		
		// nhap tu file
	public void insertFromFile() {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("dictionaries.txt"));
			String line = br.readLine();
			while(line != null) {
				
				if(line.indexOf("\t") == -1) {
					
					line = br.readLine();
					continue;
				}
					
				Word wd = new Word(line);
				Dictionary.dsWord.add(wd);
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
	
	public void showAllWords() {
		
		if(!Dictionary.dsWord.isEmpty()) {
			
			
			System.out.printf("%-4s%c%-20s%c%-20s\n", "STT", '|', "English", '|', "Vietnamese");
			int i = 1;
			for(Word ele : Dictionary.dsWord) {
				System.out.printf("%-5d", i);
				ele.printWord();
				i++;
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	

