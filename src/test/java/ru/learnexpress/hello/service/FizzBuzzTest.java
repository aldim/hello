package ru.learnexpress.hello.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.learnexpress.hello.service.impl.FuzzBuzzServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FizzBuzzTest {
    FizzBuzzService target = new FuzzBuzzServiceImpl();

    @Test
    void shouldReturnAppropriateList() {
        List<String> value = target.getFizzBuzz(15);
        String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        assertNotNull(value, "should contain elements");
        assertArrayEquals(value.toArray(), expected);
    }
}
