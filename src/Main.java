import java.util.List;
import java.util.Scanner;

/*
1
Создайте новый проект (лучше, если вы сделаете это в новой отдельной папке). При создании проекта укажите "создать Git репозиторий" Создайте репозиторий на GitHub. По примеру того, как жто было сделано на занятии свяжите локальный репозиторий и удаленный репозиторий. Залейте код на GitHub

В 19 уроке у нас написана программа Dictionary (словарь). Ваша задача переписать этот код так, что бы класс Dictionary использовал вместо массива List Залейте код на GitHub
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Word>wordList= List.of(
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол")
        );

        Dictionary dictionary =new Dictionary(wordList);


        int mode=1;

        while (true) {
            System.out.println("Выберите режим работы:\n '1'. прямой \n '2'. обратный \n '3'. все слова \n '0'. завершить программу");
            mode = scanner.nextInt();
            scanner.nextLine(); //очистить поток ввода
            if (mode==0) break;
            String word="";
            if (mode==1){
                System.out.println("Введите слово:");
                word = scanner.nextLine();
                System.out.println("Перевод:" + dictionary.getTranslationByWord(word));
            } else if (mode==2){
                System.out.println("Введите перевод:");
                word = scanner.nextLine();
                System.out.println("Слово:" + dictionary.getWordByTranslation(word));
            } else if(mode==3){
                System.out.println("Текущий словарь:");
                System.out.println(wordList);
            }
            System.out.println("-----------------------------------------------------------");
        }
    }
}