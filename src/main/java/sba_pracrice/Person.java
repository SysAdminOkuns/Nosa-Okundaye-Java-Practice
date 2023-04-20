package sba_pracrice;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;



    private LocalDate dob;

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String toString(){

        return "Firstname: " + this.getFirstName() + " Lastname: "
                + this.getLastName() + " DOB: " + this.getDob();
    }


}
