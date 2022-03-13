package com.co.ao.rules;

import java.util.HashMap;
import java.util.Map;

public class BusinessRule<T> implements Rules<T> {

    private Map<String, Rule<T>> ownRules;

    public BusinessRule() {
        this.ownRules = new HashMap<String, Rule<T>>();
    }

    @Override
    public void add(String attribute, Rule<T> rule) {
        if (!this.ownRules.containsKey(attribute)) {
            this.ownRules.put(attribute, rule);
        }
    }

    @Override
    public void delete(String attribute, Rule<T> rule) {

        if (this.ownRules.containsKey(attribute)) {
            this.ownRules.remove(attribute);

        }

    }

    @Override
    public void update(String attribute, Rule<T> rule) {

        if (this.ownRules.containsKey(attribute)) {
            Rule<T> oldRule = this.ownRules.get(attribute);
            this.ownRules.replace(attribute, oldRule, rule);
        }

    }

    @Override
    public void cleanAll() {

        this.ownRules.clear();
    }

    public boolean exist(String attribute) {
        return this.ownRules.containsKey(attribute);
    }

    public Rule<T> getRule(String attribute) {
        return this.ownRules.get(attribute);
    }

    public void printRules() {

        for (String attribute : this.ownRules.keySet()) {
            System.out.println(attribute + " " + this.ownRules.get(attribute).operator() + " "
                    + this.ownRules.get(attribute).value());
        }

    }

}
