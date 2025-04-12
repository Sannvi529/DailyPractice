package cn.zcy;

/**
 * @author 张英琪
 */
public class Code02_LinkedListToQueueAndStack {
    public static class Node<V>{
        public V value;
        public Node<V> next;
        public Node(V v){
            value = v;
            next  = null;
        }
    }
    public static class MyQueue<V>{
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyQueue(){
            head = null;
            tail = null;
            size = 0;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public int size(){
            return size;
        }
        public void offer(V value){//接收值，
            Node<V> cur = new Node<V>(value);//新建结点
            if(tail == null){//尾巴为空，一个结点也没有
                head = cur;
                tail = cur;
            }else{
                tail.next = cur;
                tail = cur;
            }
            size++;
        }
        public V poll(){
            V ans = null;
            if(head!= null){
                ans = head.value;
                head = head.next;
                size--;
            }
            if(head == null){//当链表中的元素全部都弹出去完了，tail和head一样都指向空
                tail = null;
            }
            return ans;
        }
        public V peek(){
            V ans = null;
            if(head != null){
                ans = head.value;
            }
            return ans;
        }
    }
}
