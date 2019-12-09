package com.robosh;

import java.util.Collection;
import java.util.HashMap;

public class HashSet<T> implements MySet<T>{
    private HashMap<T,Object> map;
    private static final Object PRESENT = new Object();

    public HashSet(){
        map = new HashMap<T, Object>();
    }

    @Override
    public boolean add(T element) {
        return map.put(element, PRESENT)==null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();
    }

    public String get(){
        return map.keySet().toString();
    }
}
