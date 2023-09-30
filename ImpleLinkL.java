import java.util.LinkedList;

public class ImpleLinkL {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        //linkedList.pop();
        linkedList.add(1, "E");
        linkedList.remove("E");
        System.out.println(linkedList.peekLast());
        
        System.out.println(linkedList);
    }

}
