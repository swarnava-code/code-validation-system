package com.swarna.code.abstraction;

@FunctionalInterface
public interface Implementable<T, R> {
    R implementLogic(T input);
}
