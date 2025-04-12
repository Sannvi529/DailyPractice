package cn.zcy;

/**
 * @author 张英琪
 */
public class Test01 {
    //单链表的反转
    public static class Node{
        public int value ;
        public Node next;
        public Node(int data){
            value = data;
        }
    }
    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data){
            value = data;
        }
    }
    public static Node reverseLinkedList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static DoubleNode reverseLinkedList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            head.last  = next;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        Node n1= new Node(1);
        n1.next = new Node(2);
        n1.next.next  = new Node(3);
        n1 = reverseLinkedList(n1);
        while(n1 != null){
            System.out.print(n1.value+" ");
            n1 = n1.next;
        }
        System.out.println();
    }

}
