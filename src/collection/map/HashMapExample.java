package collection.map;

import java.util.HashMap;

/**
 * @author Mr.Yog
 * Hashmaps won't allow duplicate values
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> phonebook = new HashMap<>();
        phonebook.put("Max",12345);
        phonebook.put("SAM",22323);
        phonebook.put("BOB",55454);
        phonebook.put("JOHN",50054);
        if (phonebook.containsKey("BOB")){
            phonebook.remove("BOB");
        }
        System.out.println(phonebook);
    }
}
