package ConstructionSummer.Generics;

public class MyArrayList<T> {

    private T[] data;
    private int size;

    public MyArrayList() {
        size = 0;
        data = (T[]) new Object[3];
    }

    public void add(T element) {
        data[size] = element;
        size++;
    }


    public String toString() {
        String result = "[";
        for (int i = 0; i < size - 1; i++) {
            result += data[i] + ", ";
        }
        result += data[size - 1];
        result += "]";
    }
}