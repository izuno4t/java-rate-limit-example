package com.example.guava;


import java.util.stream.IntStream;

public class Example {


    public static void main(String args[]) {

        var foo = new Foo();

        IntStream.rangeClosed(1, 1000000).forEach(it -> {
                    foo.print(it);
                    try {
                        Thread.sleep(100); // 1秒間だけ処理を止める
                    } catch (InterruptedException e) {
                    }
                }
        );

    }


}

