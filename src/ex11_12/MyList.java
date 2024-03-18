package ex11_12;


import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    int size = 0;
    static final int DEAFAULT_CAPACITY=10;
    Object elements[];

    public MyList() {
        elements = new Object[0];
    }
    public MyList(int capacity){
        elements=new Object[capacity];
    }
    public void add(int index,E element) {
        Object newElements[] = new Object[elements.length+1];
        if (index<=size){
            for (int i = 0; i < newElements.length; i++) {
                if (i<index){
                    newElements[i]=elements[i];
                }else {
                    newElements[i + 1] = newElements[i];
                }
            }
            newElements[index]=element;
        }
        elements=newElements;
        this.size=elements.length;
    }
    public E remove(int index) {
        Object newElements[] = new Object[elements.length-1];
        for (int i = 0; i < newElements.length; i++) {
            if (i<index){
                newElements[i]=elements[i];
            }
            else{
                newElements[i]=elements[i+1];
            }
        }
        elements=newElements;
        return (E) elements;
    }
    public int size(){
        return elements.length;
    }
    public E clone(){
        Object[] newList = new MyList[]{new MyList<>()};
        newList = elements;
        return (E) newList;
    }
    public boolean contains (E o){
        boolean check = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]==o) {
                check= true;
                break;
            }
        }
        return check;
    }
    public  int indexOf(E o) {
        int index=-1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index=i;
                break;
            }
        }
        return index;
    }
    public boolean add(E o){
        Object newElements[] = new Object[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i]=elements[i];
        }
        newElements[newElements.length-1]=o;
        elements=newElements;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (size< minCapacity){
            size= minCapacity;
        }
    }
    public E get(int i) {
        Object newElements = new Object();
        for (int j = 0; j < elements.length; j++) {
            if (j==i){
                newElements = elements[j];
                break;
            }
        }
        return (E) newElements;
    }
    public void clear(){
        elements= new Object[0];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
