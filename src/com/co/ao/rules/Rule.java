package com.co.ao.rules;

public class Rule<T> {

    private String operator;
    private T value;

    public Rule() {

    }

    public void operator(String operator) {
        this.operator = operator;
    }

    public String operator() {
        return this.operator;
    }

    public T value() {
        return this.value;
    }

    public void value(T value) {
        this.value = value;
    }

}
