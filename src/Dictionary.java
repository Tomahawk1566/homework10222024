import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> words;

    public Dictionary(List<Word> wordList){

        this.words = new ArrayList<>(wordList);
    }

    public String getTranslationByWord(String word){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).word.equalsIgnoreCase(word)){
                return words.get(i).getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation){
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).translation.equalsIgnoreCase(translation)){
                return words.get(i).getWord();
            }
        }
        return "";
    }

    public String toString(){
        String result="";
        for (int i = 0; i < words.size(); i++) {
            result+= words.get(i)+ System.lineSeparator();  // \n
        }
        return result;
    }

}
