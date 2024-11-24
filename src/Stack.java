import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private T[] elements;
    private int length;
    private static int startLength = 5;

    public Stack(){
        elements = (T[]) new Object[startLength];
        length = 0;
    }

    public void push(T el){
        elements[length++] = el;
        if(length == elements.length){
            update();
        }

    }

    public T pop() throws  Exception{
        if(length == 0){
            throw new Exception("В стеке отсутствуют элементы");
        }
        T temp = elements[--length];
        elements[length] = null;
        return temp;

    }
    public void update(){
        T[] tempArr = (T[]) new Object[length + 1];
        System.arraycopy(elements, 0, tempArr, 0, length);
    }

    public void Show(){
        for(int i = 0; i < length; ++i){
            System.out.println(elements[i]);
        }
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int current = 0;
            @Override
            public boolean hasNext(){
                return (current < length);
            }

            @Override
            public T next(){
                if (hasNext()){
                    return elements[current++];
                }
                return null;
            }
        };
    }
}
