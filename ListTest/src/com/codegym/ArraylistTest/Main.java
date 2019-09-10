package com.codegym.ArraylistTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        // khai bao list:
        List<Person> listPerson = new ArrayList<Person>();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p3);

        Person p = listPerson.get(0);
    System.out.println(p.getId());
        System.out.println("1.Cac person :");
        for (Person person:listPerson) {
            System.out.println(person.getId());
        }
        System.out.println("2.cac person : ");
        for(int i = 0 ;i < listPerson.size();i++)
        {
            System.out.println(listPerson.get(i).getId());
        }
        //xoa phan tu:

        listPerson.remove(3); // xoa tai vi tri
        System.out.println("Da xoa o vi tri thu 3 .Hien tai mang con: ");
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }
        System.out.println("Da xoa gia tri p1.Mang con: ");
        listPerson.remove(p1); // xoa theo gia tri oop
        for(Person person :listPerson) {
            System.out.println(person.getId());
        }
        System.out.println("--------");
        listPerson.remove(new Person(2));
        for (Person person: listPerson){
            System.out.println(person.getId());
        }

    }
}
