package org.example;

import java.util.ArrayList;

public class UserRepository extends UserTest {
    static ArrayList<Person> arrayList2 = new ArrayList<>();
    static public void AddUser(Person person){
        arrayList2.add(person);
        for (Person pers : arrayList2) {
            System.out.println(pers);
        }

    }
    static public void GetUser(int UserId){
        System.out.println(arrayList1.get(UserId));
    }
    static public void GetOrderedUsers(){
        for(int i=0; i<arrayList1.size() ;i++)
        System.out.println(arrayList1.get(i));
    }

}
