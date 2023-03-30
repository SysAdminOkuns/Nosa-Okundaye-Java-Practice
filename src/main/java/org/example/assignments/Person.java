package org.example.assignments;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {
//    Define your own class with your own properties and methods
//    Add getters and setters of those properties
//    Create two object instances of that class in the “main” method
//    Use setter to set the properties

    private String firstName, lastName;
    private int age;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, int age, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
    }
    public static  void main(String[] args){

        LocalDate birthday1 = LocalDate.of(2000, 2, 23);
        LocalDate birthday2 = LocalDate.of(1990, 1, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        Person lucy = new Person("Lucy", "Tommy", 23, birthday1);
        Person bob = new Person("Bobby", "Ray", 33, birthday2);

        lucy.setBirthDay(birthday1);
        bob.setBirthDay(birthday2);

        String bday1 = lucy.getBirthDay().format(formatter);
        String bday2 = bob.getBirthDay().format(formatter);

        System.out.println(bday1);
        System.out.println(bday2);

    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
