package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printErr() {
        System.out.println("Error: " + active);
        System.out.println("Error code: " + status);
        System.out.println("Description: " + message);
    }

    public static void main(String[] args) {
        Error eventOne = new Error();
        eventOne.printErr();
        Error eventZero = new Error(false, 0, "No error");
        eventZero.printErr();
        Error eventTwo = new Error(true, 2, "Second error");
        eventTwo.printErr();
    }
}
