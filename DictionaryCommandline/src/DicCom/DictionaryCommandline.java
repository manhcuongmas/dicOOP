package DicCom;


public class DictionaryCommandline {

		public void dictionaryBasic() {
			
			DictionaryManagement dc = new DictionaryManagement();
			dc.insertFromCommandline();
			dc.showAllWords();
			
		}
		
		
		
		
		public void dictionaryAdvanced() {
			DictionaryManagement dc = new DictionaryManagement();
			dc.insertFromFile();
			//dc.dictionaryLookup();
			//dc.showAllWords();
			//dc.dictionarySearcher();
			dc.dictionaryExportToFile();
			
			
			
		}
	
			
		public static void main(String[] args) {
			DictionaryCommandline ds = new DictionaryCommandline();
			ds.dictionaryAdvanced();
			
		}
			

		
		
			
			
}
	
	
	
	

