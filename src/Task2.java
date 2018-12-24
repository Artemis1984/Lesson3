import java.util.HashMap;

public class Task2 {

    private static HashMap<String, String> phoneBook = new HashMap<>();

    private static void add(String key, String value){

         if (phoneBook.get(key) == null)
             phoneBook.put(key, value);
         else
             phoneBook.put(key, phoneBook.get(key).concat(" " + value));
    }

    private static void get(String key){

        System.out.println("Под Фамилией " + key + " есть следующие номера " + phoneBook.get(key));
    }

    public static void main(String[] args) {

        add("Иванов", "+79160916098");
        add("Иванов", "+74952257634");
        add("Сидоров", "+79160915383");
        add("Сидоров", "+78653487763");
        add("Сидоров", "+74956623718");
        add("Петров", "+79687752314");
        get("Иванов");
        get("Петров");
        get("Сидоров");

    }

}
