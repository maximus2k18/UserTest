package ru.muravjev;

public class UserTest {
    public static void main(String[]args){
        Person person1 = new Person();
        person1.setUserId(-11);
        System.out.println("Вывод ID: " +(person1.getUserId()));
        person1.setName("Ilya");
    }
}
class Person {
    private int Userid;
    private String name;
    public void setUserId(int UserId){
        if (UserId<0)
            this.Userid=-UserId;
        else
            this.Userid = UserId;
    }
    public int getUserId(){
        return Userid;
    }
    public void setName(String name) {
        if (name.isEmpty())
            System.out.println("Пустая строка");
        else
            this.name = name;
    }
    public String getName() {
        return name;
    }


    void AddUser()
    {

    }

    void GetUser(){

    }
    void GetOrderedUsers(){

    }
}
