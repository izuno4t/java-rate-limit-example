package com.example.guava;

import com.google.common.util.concurrent.RateLimiter;

public class Foo {

    private static final Double PERMITS_PER_SECONDS = 1d;
    private static final int PERMITS_CONSUMED = 1;

    private final RateLimiter rateLimiter = RateLimiter.create(PERMITS_PER_SECONDS);

    public void print(int count) {
        final boolean acquired = rateLimiter.tryAcquire(PERMITS_CONSUMED);
        if (acquired) {
            System.out.println("count=" + count);
        }
    }
}
