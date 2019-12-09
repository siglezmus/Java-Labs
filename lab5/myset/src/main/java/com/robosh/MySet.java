package com.robosh;


public interface MySet<T> {
    boolean add(T element);

    boolean remove(Object o);

    boolean contains(Object o);

    boolean isEmpty();

    int size();

    void clear();

}
