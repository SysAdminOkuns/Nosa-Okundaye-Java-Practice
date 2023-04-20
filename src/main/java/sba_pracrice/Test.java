package sba_pracrice;

@FunctionalInterface
interface MyFunctionalInterface {
    public Integer sqr(int a);

    default String sqr(String a) {
        return a + a;
    }
}

@FunctionalInterface
interface MyFunctionalInterface1 {
    public Integer apply(Integer n, Integer e);

    default Integer apply() {
        return 0;
    }
}

public class Test {
    public static void main(String[] args) {
        MyFunctionalInterface fi = n -> {
            return n * n;
        };
        System.out.println(fi.sqr(5));

        MyFunctionalInterface1 f1 = (x,y) -> x + y;

        System.out.println(f1.apply());
    }
}