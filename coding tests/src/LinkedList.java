import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node node;

    static class Node{
        int data;
        Node nextAddress;
    }
    public static int push(Node head, int newData){
        Node node = new Node();
        node.data = newData;
        node.nextAddress= head;
        head= node;
        return head.data;
    }
    public static List<Integer> printAll(Node head){
        List<Integer> lists= new ArrayList<>();
        while (head!=null){
            lists.add(head.data);
            head = head.nextAddress;
        }
        return lists;
    }

    public static void main(String[] args) {
        Node head = new Node();
        head.data=5;

        Node secondNode = new Node();
        secondNode.data=1;

        Node thirdNode = new Node();
        thirdNode.data= 67;

        head.nextAddress= secondNode;
        secondNode.nextAddress= thirdNode;

        int newData = 20;
        System.out.println(push(head, newData));
        System.out.println(printAll(head));
    }


}
