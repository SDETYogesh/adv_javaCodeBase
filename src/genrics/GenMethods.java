package genrics;

import java.util.ArrayList;
import java.util.List;

public class GenMethods {
    static Character [] charArray = {'f','g','h','j','k'};
    static Integer [] intArray ={3,3,5,4,6};
    static Boolean [] boolArray ={true,true,false};

    public static <T> List<T> arrayToList(T[] array, List<Object> list){
        for (T obj : array){
            list.add(obj);
        }
        return (List<T>) list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray,new ArrayList<>());
        List<Integer> intList = arrayToList(intArray,new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray,new ArrayList<>());
    }

}
