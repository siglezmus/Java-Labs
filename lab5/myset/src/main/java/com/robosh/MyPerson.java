package com.robosh;

import java.util.Objects;

public class MyPerson {
    public String name;
    public int age;

    public MyPerson(){
        name = "default";
        age = 0;
    }
    public MyPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return ("Name: " + name + " age: " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPerson myPerson = (MyPerson) o;
        return age == myPerson.age &&
                Objects.equals(name, myPerson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
