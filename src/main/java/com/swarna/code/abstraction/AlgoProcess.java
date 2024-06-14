package com.swarna.code.abstraction;

public abstract class AlgoProcess<T, R> {
    private  Inputtable<T> inputtable;
    private  Implementable<T, R> implementable;
    private  Printable<R> printable;

    public R implement(T t) {
        R r = null;
        // TODO
        return r;
    }

    public R executeOverrides(T t) {
        inputtable = () -> t;
        R output = implement(t);
        printable = () -> output;
        return output;
    }

}
