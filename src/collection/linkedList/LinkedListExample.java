package collection.linkedList;

import java.util.LinkedList;

/**
 * @author Mr.Yog
 * Use this type of collection for better add/remove operations
 */

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
    }
}
