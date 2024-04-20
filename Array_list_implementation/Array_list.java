package Array_list_implementation;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Array_list<E> {
    public int size;
    private static final int DEFAULT_CAPACITY = 10;

    private Object elements[];

    public Array_list() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public void deleteLastElement() {
        elements[size - 1] = null;
        size--;
    }

    public void deleteFirstElement(Array_list<Object> list) {
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public void deleteWithIndexElement(int index){
        if (size == 0) {
            throw new NoSuchElementException("List is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == 1 || index == size - 1) {
            deleteLastElement();
        } else {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
        }
        size--;
        }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Elemets with that index is not hier");
        }
        return (E) elements[index];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void print(Array_list<Object> list) {
        for (int i = 0; i < list.size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}
