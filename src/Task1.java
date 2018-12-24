import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Google" );
        words.add("Facebook");
        words.add("Apple");
        words.add("Twitter");
        words.add("Yahoo");
        words.add("Google");
        words.add("Facebook");
        words.add("Sony");
        words.add("Samsung");
        words.add("Geekbrains");
        words.add("Google");

        System.out.println(words + " изначальный размер массива " + words.size());

        HashSet<String> uniqWords = new HashSet<>(words.subList(0, words.size()));

        System.out.println(uniqWords + " размер уникального масиива " + uniqWords.size());

        System.out.println();

        for (String uniqword : uniqWords) {

            int count = 0;

            for(String word : words){

                if (uniqword.equals(word))
                    count++;
            }

            if (count > 1)
                System.out.println("слово " + uniqword + " повторяется " + count + " раза");
        }

    }

}
