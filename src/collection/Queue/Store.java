package collection.Queue;

import java.util.LinkedList;

/**
 * @author Mr.Yog
 */
public class Store {

    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("RAM")); //add method is known as tail as it adds data to end
        queue.add(new Customer("Sita"));
        queue.add(new Customer("Ayodhya"));
        queue.add(new Customer("Lanka"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void  serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll(); //poll method returns the 1st data from queue & remove it.
        c.serve();;
    }
}
