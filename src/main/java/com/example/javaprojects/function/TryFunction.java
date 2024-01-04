package com.example.javaprojects.function;

public interface TryFunction<T,U,V,R,Z> {
    Z apply(T t, U u, V v,R r);
}
