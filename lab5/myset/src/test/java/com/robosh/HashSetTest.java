package com.robosh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HashSetTest {

    private HashSet<Integer> intHashSet = new HashSet<>();

    @Test
    public void testAdd() {
        intHashSet.clear();

        intHashSet.add(1);
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);
        intHashSet.add(4);

        System.out.println(intHashSet.get());
        assertEquals(4, intHashSet.size());
    }

    @Test
    public void testIsEmpty() {
        intHashSet.clear();

        intHashSet.add(1);
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);
        intHashSet.add(4);

        assertFalse(intHashSet.isEmpty());

        intHashSet.clear();

        assertTrue(intHashSet.isEmpty());
    }

    @Test
    public void testContains() {
        intHashSet.clear();

        intHashSet.add(1);
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);
        intHashSet.add(4);

        assertFalse(intHashSet.contains(6));

        intHashSet.add(6);

        assertTrue(intHashSet.contains(6));

        intHashSet.clear();


    }


    @Test
    public void testSize() {
        intHashSet.clear();

        intHashSet.add(1);
        intHashSet.add(1);
        intHashSet.add(2);
        intHashSet.add(2);
        intHashSet.add(3);
        intHashSet.add(4);
        intHashSet.add(4);

        assertEquals(4, intHashSet.size());

        intHashSet.clear();
        assertEquals(0, intHashSet.size());

    }

    @Test
    public void testForObjects() {

        HashSet<MyPerson> set = new HashSet<>();

        set.add(new MyPerson());
        set.add(new MyPerson());
        set.add(new MyPerson("Eric", 20));
        set.add(new MyPerson("Eric", 20));
        set.add(new MyPerson("Andrey", 20));
        set.add(new MyPerson("Katia", 20));

        System.out.println(set.get());

        assertEquals(4, set.size());

    }

    @Test
    public void testForObjects2() {

        HashSet<MyPerson> set = new HashSet<>();

        MyPerson person = new MyPerson();

        set.add(person);
        set.add(person);
        set.add(person);
        set.add(new MyPerson("Eric", 20));
        set.add(new MyPerson("Andrey", 20));
        set.add(new MyPerson("Katia", 20));

        System.out.println(set.get());

        assertEquals(4, set.size());

    }

}

