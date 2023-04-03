package genrics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenExamples {
    public static void main(String[] args) {

        //Example without Generics
        List names = new ArrayList<>();
        names.add("kelly");
        String name = (String) names.get(0);
        System.out.println("First name : "+ name);

        //Example with generics
        List<String> names2 = new ArrayList<>();
        names2.add("kelly");
        String name2 = names2.get(0);
        System.out.println("first name : "+ name2);
    }
}
