package JavaCollection;
import java.util.LinkedList;
public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<String >li1 = new LinkedList<>();
        LinkedList<String>li2 = new LinkedList<>();

        li1.add("apple");
        li1.add("banana");
        li1.add("mango");
        li2.add("apple");
        li2.add("banana");
        li2.add("mango");

        if(li1.equals(li2)){
            System.out.println("LinkedList are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
