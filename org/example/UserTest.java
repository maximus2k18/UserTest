package org.example;

import java.util.ArrayList;


public class UserTest {
   static ArrayList<Person> arrayList1 = new ArrayList<>();
    public static void main(String[]args){
        Person person2 = new Person(1,"Мария");
        Person person1 = new Person(0,"Максим");
        Person person3 = new Person(2,"Илья");

        arrayList1.add(person1);
        arrayList1.add(person2);
        arrayList1.add(person3);
        UserRepository.AddUser(person3);
        UserRepository.GetUser(0);
        UserRepository.GetOrderedUsers();
   /*     for (Person person : arrayList1) {
            System.out.println(person);
        }*/
    }
}

