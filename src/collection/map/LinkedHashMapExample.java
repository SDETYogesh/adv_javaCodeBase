package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Mr.Yog 
 */

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("Max",12345);
        phonebook.put("SAM",22323);
        phonebook.put("BOB",55454);
        phonebook.put("JOHN",50054);
        System.out.println("SAM'S NO. IS "+ phonebook.get("SAM"));

        System.out.println("List of contacts");
        for (Map.Entry<String,Integer> entry : phonebook.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
    }
    }
}
