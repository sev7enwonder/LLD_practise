import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    int key,val,cnt;
    public Node(int key,int val){
        this.key = key;
        this.val = val;
        this.cnt = 1;
    }
    Node prev,next;
}
class DLL {
    Node head,tail;
    int size = 0;
    public DLL(){
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public void add(Node node){
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
        size++;
    }

    public void remove(Node node){
        Node prev = node.prev;
        prev.next = node.next;
        node.next.prev = prev;
        size--;
    }

    public Node removeLast(){
        if(size > 0){
            Node tmp = tail.prev;
            remove(tail.prev);
            return tmp;
        }
        return null;
    }

    public int size(){
        return size;
    }
}

public class main {

    public static void main(String[] args) {
        Map<Integer, DLL> map = new HashMap<>();
        DLL oldList = map.getOrDefault(4,new DLL());

        oldList.add(new Node(4,5));
        oldList.add(new Node(5,5));

        map.put(4,oldList);


        System.out.println(map.get(4).size);


        DLL newOld = map.get(4);

        newOld.add(new Node(10,12));
        
        System.out.println(map.get(4).size);

    }
}
