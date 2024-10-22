public class Word {
    String word;
    String translation;

    public Word(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }


    public  String toString(){
        return String.format("Слово: %s Перевод: %s",word, translation);
    }

}
