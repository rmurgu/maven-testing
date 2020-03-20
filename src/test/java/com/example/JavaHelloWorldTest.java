package com.example;

public class JavaHelloWorldTest {

    public void testGetHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assert("Hello World".equals(helloWorld.getHello()));
    }
}