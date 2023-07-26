package ss10.exercise;
import java.util.Arrays;

public class MyArrayList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    // phương thuc khong tham so
    public MyArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }
    public int size(){
        return this.size;
    }
    public void clear(){
        size = 0;
        for ( int i = 0; i < elements.length;i++){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if (elements.length == size){
            ensureCapacity(10);
        }
        elements[size]  = element;
        size++;
        return true;
    }
    // tăng kích thước mảng
    public void ensureCapacity(int minCapacity){
        if (minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, size);
        }else {
            throw new IllegalArgumentException("minCapacity" +minCapacity);
        }
    }
    // thêm phần tử tại vị trí index chỉ định
    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException("index" + index);
        }else if(elements.length == size){
            this.ensureCapacity(10);
        }
        if (elements[index] == null) {
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = element;
        size++;
    }
    // getIndex
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size;i++){
            if (elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<E>();
        v.elements  = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
    // xoá phần tử tại vị trí index
    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error Index" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        elements[size -1] = null;
        size--;
        return element;
    }
}

