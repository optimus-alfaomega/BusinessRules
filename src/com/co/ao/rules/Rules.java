package com.co.ao.rules;

public interface Rules<T> {

    public void add(String attribute, Rule<T> rule);

    public void delete(String attribute, Rule<T> rule);

    public void update(String attribute, Rule<T> rule);

    public void cleanAll();

}
