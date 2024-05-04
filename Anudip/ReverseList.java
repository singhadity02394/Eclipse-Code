package Anudip;
import java.util.*;
class ListString{
    public void printList(List<String> ss){
        System.out.println("Before the reverse:" +ss);

        Collections.reverse(ss);

        System.out.println("Reversed List: " + ss);



    }


}

public class ReverseList {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("Apple");
        string.add("Banana");
        string.add("Orange");
        string.add("Grapes");


        ListString ll = new ListString();
        ll.printList(string);
    }
}
