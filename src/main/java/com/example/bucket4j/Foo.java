package com.example.bucket4j;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;

import java.time.Duration;

public class Foo {


    //    private final Refill refill = Refill.greedy(10, Duration.ofSeconds(1));
    private final Refill refill = Refill.intervally(10, Duration.ofSeconds(1));

    private final Bandwidth limit = Bandwidth.classic(10, refill);

    private final Bucket bucket = Bucket.builder().addLimit(limit).build();

    public void print(int count) {
        final boolean acquired = bucket.tryConsume(1);
        if (acquired) {
            System.out.println("count=" + count);
        }
    }
}
