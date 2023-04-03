package variableArguments;

public class VarArgs {

    public static void main(String[] args) {
        String itm1 = "apple";
        String itm2 = "orange";
        String itm3 = "pears";

//        String[] shopping = {"bread", "milk", "almonds", "banana"};
//        printShoppingList(shopping);
        printShoppingList("bread", "milk", "almonds", "banana");

        printShoppingList(itm1, itm2, itm3);

    }

//    private static void printShoppingList(String[] items) {
//        System.out.println("Shopping List");
//        for (int i=0;i< items.length;i++){
//            System.out.println(i+1 +" : "+ items[i]);
//        }
//    }
//
//    private static void printShoppingList(String string1,String string2) {
//        System.out.println("Shopping List");
//        System.out.println("1 "+string1);
//        System.out.println("2 "+string2);
//    }
//
//    private static void printShoppingList(String string1, String string2, String string3) {
//        System.out.println("Shopping List");
//        System.out.println("1 "+ string1);
//        System.out.println("2 "+ string2);
//        System.out.println("3 "+string3);
//    }

    private static void printShoppingList(String... items) {
        System.out.println("Shopping List");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + " : " + items[i]);
        }
    }
}
