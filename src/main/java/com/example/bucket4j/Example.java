package com.example.bucket4j;


import java.util.stream.IntStream;

public class Example {


    public static void main(String args[]) {

        var foo = new Foo();

        IntStream.rangeClosed(1, 100).forEach(it -> {
                    foo.print(it);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }
                }
        );

    }


}

