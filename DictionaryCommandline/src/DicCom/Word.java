package DicCom;

public class Word {
	private String word_target;
	private String word_explain;
	public String getWord_target() {
		return word_target;
	}
	public void setWord_target(String word_target) {
		this.word_target = word_target;
	}
	public String getWord_explain() {
		return word_explain;
	}
	public void setWord_explain(String word_explain) {
		this.word_explain = word_explain;
	}
	public Word(String word_target, String word_explain) {
		super();
		this.word_target = word_target;
		this.word_explain = word_explain;
	}
	public Word() {
		
		
	}
	public Word(String linefromdictionary) {
		
		word_target = linefromdictionary.substring(0, linefromdictionary.indexOf("\t"));
		word_explain = linefromdictionary.substring(linefromdictionary.indexOf("\t") + 1 );
		
		
	}
	public void printWord() {
		
		System.out.printf("%-20s%-20s\n", word_target, word_explain);
		
		
	}
	
	
	
	
}
