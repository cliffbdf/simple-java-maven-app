package com.mycompany.app;

/**
 * Hello world!  a change
 */
public class App
{

    private final String message = "Hello Big World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
