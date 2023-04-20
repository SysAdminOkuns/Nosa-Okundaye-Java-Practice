package sba_pracrice;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main1{
    private static List<Person> myPersons = new ArrayList<>();

    public static void main(String[] args) {
//        Runnable runner = new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//            }
//        };
//
//        runner.run();

//        Runnable runnable = () -> System.out.println("Hello from lambda!");
//        runnable.run();

        LocalDate dob1 = LocalDate.of(1992, Month.SEPTEMBER, 3);
        LocalDate dob2 = LocalDate.of(2018, Month.APRIL, 16);
        LocalDate dob3 = LocalDate.of(1983, Month.JANUARY, 31);
        LocalDate dob4 = LocalDate.of(1984, Month.JULY, 16);

        Person person4 = new Person("Paul", "Grant",dob1);
        Person person1 = new Person("Peter", "Grant",dob1);
        Person person3 = new Person("samuel", "Grant",dob1);
        Person person2 = new Person("Triad", "Grant",dob1);

        myPersons.add(person1);
        myPersons.add(person2);
        myPersons.add(person3);
        myPersons.add(person4);

        Collections.sort(myPersons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

//        System.out.println(myPersons);

//        for(Person p: myPersons){
//            System.out.println(p.getFirstName());
//        }

        Calculator product = (x, y) ->  x * y;
        Calculator quotient = (x, y) -> x / y;
        Calculator sum = (x, y) -> x + y;
        Calculator substract = (x, y) -> x - y;

//        System.out.println(product.calculate(5, 2));
//        System.out.println(quotient.calculate(5, 2));
//        System.out.println(sum.calculate(5, 2));
//        System.out.println(substract.calculate(5, 2));

        myCalculator(product, quotient);

    }

    public static void myCalculator(Calculator m, Calculator d){
        int product = m.calculate(10, 2);
        int quotient = m.calculate(10, 2);
        System.out.println("The product is " + product + " The quotient is " + quotient);
    }
}
