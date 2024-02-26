package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = new ThreadSafeSingleton();

    public static ThreadSafeSingleton getInstance() {
        return instance;
    }
}
