package ru.job4j.checkstyle;

public class Broken {

    private String surname;
    private String name;
    private int sizeOfEmpty = 10;
    public static final String NEW_VALUE = "";

    public Broken() { }

    public void echo() { }

    public static void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public static void method(int a, int b, int c, int d, int e, int f, int g) {
    }

}
