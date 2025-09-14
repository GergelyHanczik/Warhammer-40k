package main.java;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 6).toArray()[2]);
    }
}
