package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


            System.out.println("Hello world by"+ Thread.currentThread().getName());
            HelloWorldPrinter hw = new HelloWorldPrinter() ;
            Thread t = new Thread(hw) ;
            t.start() ;


            System.out.println("Hello world from thread" + Thread.currentThread().getName());
    }
}