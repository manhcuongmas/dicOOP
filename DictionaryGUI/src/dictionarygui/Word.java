/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarygui;

/**
 *
 * @author Administrator
 */
public class Word {
        public String kindofWord;
        //Bien ten tu moi
        public String EnglishWord;
        // Bien giai nghia
        public String Explain;
        //Bien vi du
        public String transcription;
        // vi du
        public String Example;
        //giai nghia vi du
        public String explainExample;

    public Word(String EnglishWord, String Explain, String transcription, String explain, String explainExample,String kindofWord) {
        this.EnglishWord = EnglishWord;
        this.Explain = Explain;
        this.transcription = transcription;
        this.Example = explain;
        this.explainExample = explainExample;
        this.kindofWord = kindofWord;
    }

    public Word() {
        this.EnglishWord = "";
        this.Explain = "";
        this.transcription = "";
        this.Example = "";
        this.explainExample = "";
        
    }

    public String getEnglishWord() {
        return EnglishWord;
    }

    public void setEnglishWord(String EnglishWord) {
        this.EnglishWord = EnglishWord;
    }

    public String getExplain() {
        return Explain;
    }

    public void setExplain(String Explain) {
        this.Explain = Explain;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public String getExample() {
        return Example;
    }

    public void setExample(String Example) {
        this.Example = Example;
    }

    public String getExplainExample() {
        return explainExample;
    }

    public void setExplainExample(String explainExample) {
        this.explainExample = explainExample;
    }

    public Word(String EngString,String exString){
        EnglishWord = EngString;
        Explain = exString;
       
    }
        
        
        
        
    
    
}
