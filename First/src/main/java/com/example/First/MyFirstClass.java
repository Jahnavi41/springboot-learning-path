package com.example.First;

public class MyFirstClass {

    private final String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello! Hi from MyFirstClass! ==> myVar is: "+myVar;
    }
}
