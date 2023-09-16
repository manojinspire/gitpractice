package org.example;

public class HelloWorldPrinter  implements Runnable{

    public void run(){
        System.out.println("Thread by" + Thread.currentThread().getName()) ;
    }
}
