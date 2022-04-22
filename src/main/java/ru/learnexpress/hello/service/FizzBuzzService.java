package ru.learnexpress.hello.service;

import java.util.List;

/**
 * "Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 */
public interface FizzBuzzService {
    List<String> getFizzBuzz(int count);
}
