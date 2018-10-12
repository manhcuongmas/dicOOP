package DicCom;

import java.util.Scanner;

public class DictionaryCommandline {
		public void dictionaryBasic() {
//			
//			DictionaryManagement dc = new DictionaryManagement();
//			dc.insertFromCommandline();
//			dc.showAllWords();
//			
		}
		
		
		
		
		public void dictionaryAdvanced() {
			DictionaryManagement dc = new DictionaryManagement();
			dc.insertFromFile();
			Scanner sc = new Scanner(System.in);
		System.out.println("Nhap lua chon tim kiem:");
		System.out.println("1.In tat ca cac tu");
		System.out.println("2.Tim kiem nhung tu tuong dong!");
		System.out.println("3.tim kiem dung chinh xac tu trong tu dien");
		System.out.println("4.Sua tu");
		System.out.println("5.Them tu");
		System.out.println("6.Xoa tu");
                System.out.println("7.Xuat ra file");
		int key;
		while(true){
                do {
		System.out.print("lua chon cua ban la: " );
//		try{
                    key = Integer.parseInt(sc.nextLine());
//                 }
//                catch(NumberFormatException ex){ // handle your exception
   
//                     }
                
                
			switch (key) {
			case 1:
				dc.showAllWords();
				break;
			case 2:
				dc.dictionarySearcher();
				break;
			case 3:
				dc.dictionaryLookup();
                                break;
			case 4:
				dc.editWord();
                                break;
			case 5:
				dc.insertFromCommandline();
                                break;
			case 6:
				dc.deleteWord();
                                break;
                        case 7:
                                dc.dictionaryExportToFile();
                                break;
			default:
				break;
			}
			if(key != 1 && key != 2 && key != 3 && key != 4 && key != 5 && key != 6 && key != 7) {
				
				System.out.println("Nhap sai lua chon nhap lai!");
			}
		}while(key != 1 && key != 2 && key != 3 && key != 4 && key != 5 && key != 6 && key != 7);
			
			
			
                    }
                }
			
		public static void main(String[] args) {
			DictionaryCommandline ds = new DictionaryCommandline();
			ds.dictionaryAdvanced();
			
		}
			

		
		
			
			
}
	
