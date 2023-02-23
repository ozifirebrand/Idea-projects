package linkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
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

    public static LinkedList addTwoNumbers(LinkedList a, LinkedList b){

        /*
        512489     4562         986869
        984215     2654         968689




        UNDERSTANDING THE PROBLEM
        there's a linked list
        The linked lists have their nodes in reverse order to create an integer
        The integers obtained are summed to and returned

        TACKLING THE PROBLEM
        Create two arrays of integers
        For each array, push each element of one linked list into it
        Afterwards, add the
         */
        return null;
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
