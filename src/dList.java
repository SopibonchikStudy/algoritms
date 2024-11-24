import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class dList<T> implements Iterable<T>{
    public Node<T> head;
    public Node<T> tail;
    public int length;
    private Node<T> current;
    private Map<Integer, T> indexes;

    public dList(){
        head = null;
        tail = null;
        indexes = new HashMap<>();
    }

    public void insertT(T value) {
        if (head == null) {
            Node<T> tmp = new Node<>(value, null, null);
            head = tmp;
            tail = tmp;
        } else {
            Node<T> tmp = new Node<>(value, tail, null);
            tail.next = tmp;
            tail = tmp;
        }

        makeIndex();
        ++length;
    }
    public void insertH(T value) {
        if (head == null) {
            Node<T> tmp = new Node<>(value, null, null);
            head = tmp;
            tail = tmp;
        } else {
            Node<T> tmp = new Node<>(value, null, head);
            head.previous = tmp;
            head = tmp;
        }
        ++length;
        makeIndex();
    }

    public void remove(T value) {
        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.value == value) {
                if (tmp.previous != null) {
                    tmp.previous.next = tmp.next;
                } else {
                    head = tmp.next;
                }
                if (tmp.next != null) {
                    tmp.next.previous = tmp.previous;
                } else {
                    tail = tmp.previous;
                }
                --length;
            }
            tmp = tmp.next;
        }
        makeIndex();
    }
    public void removeH(){
        if(this.head == this.tail){
            this.head = null;
            this.tail = null;
            length = 0;
        }
        else {
            this.head.next.previous = null;
            this.head = head.next;
            --length;
        }
    }
    public void removeT(){
        if(this.head == this.tail){
            this.head = null;
            this.tail = null;
            length = 0;
        }
        else {
            this.tail.previous.next = null;
            this.tail = tail.previous;
            --length;
        }
        makeIndex();
    }

    public void edit(T value, T newValue) {
        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.value == value) {
                tmp.value = newValue;
            }
            tmp = tmp.next;
        }
        makeIndex();
    }

    public void show() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value.toString() + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public void makeIndex(){
        indexes = new HashMap<>();
        Node<T> tmp = head;
        int i = 0;
        while(tmp != null){
            indexes.put(i++, tmp.value);
            tmp = tmp.next;
        }
    }

    public T take(int i) throws Exception{
        if(!indexes.containsKey(i)) throw new Exception("This index doesn't exist");
        return indexes.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.value;
                current = current.next;
                return data;
            }
        };
    }

}
