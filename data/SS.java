import java.util.*;
class SS{
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.addFirst("a");
        List.addFirst("is");
        System.out.println(List);
        List.addFirst("This");
        List.add("list");
        System.out.println(List);
        System.out.println(List.size());
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+"->");
        }
        System.out.println("null");
        List.removeFirst();
        System.out.println(List);
        List.removeLast();
        System.out.println(List);
    }
}
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

