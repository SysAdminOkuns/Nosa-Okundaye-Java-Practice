package sba_pracrice;

interface Cat {

    default String says() {
        return "miaw";
    }
}

interface Lion {

    default String says() {
        return "ROAR!";
    }

}

class Tiger implements Cat, Lion {

    @Override
    public String says() {
        return Cat.super.says();
    }
}

public class Main3 {

    public static void main(String args[]) {
        System.out.println(new Tiger().says());
    }

}