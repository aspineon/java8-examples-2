package io.shekhar.trainings.java8.sec03.examples;

import java.util.function.Function;

public interface FunctionWithException<T, R> extends Function<T, R> {
    @Override
    R apply(T t) throws RuntimeException;
}
