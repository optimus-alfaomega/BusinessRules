package com.co.ao.rules;

public class ControlBusinessRule {

  private BusinessRule<Integer> businessRuleInt;
  private BusinessRule<Double> businessRuleDouble;
  private BusinessRule<Float> businessRuleFloat;
  private BusinessRule<String> businessRuleString;

  public ControlBusinessRule() {
    businessRuleInt = new BusinessRule<Integer>();
    businessRuleString = new BusinessRule<String>();
    businessRuleDouble = new BusinessRule<Double>();
    businessRuleFloat = new BusinessRule<Float>();
  }

  public void addBusinessRules(String attribute, String operator, String value) {

    if (this.businessRuleDouble.exist(attribute) || this.businessRuleInt.exist(attribute)
        || this.businessRuleFloat.exist(attribute)) {
      return;
    }

    Rule<String> rule = new Rule<String>();
    rule.operator(operator);
    rule.value(value);

    this.businessRuleString.add(attribute, rule);

  }

  public void addBusinessRules(String attribute, String operator, Integer value) {

    if (this.businessRuleDouble.exist(attribute) || this.businessRuleString.exist(attribute)
        || this.businessRuleFloat.exist(attribute)) {
      return;
    }

    Rule<Integer> rule = new Rule<Integer>();
    rule.operator(operator);
    rule.value(value);
    this.businessRuleInt.add(attribute, rule);
  }

  public void addBusinessRules(String attribute, String operator, Float value) {

    if (this.businessRuleDouble.exist(attribute) || this.businessRuleInt.exist(attribute)
        || this.businessRuleString.exist(attribute)) {
      return;
    }

    Rule<Float> rule = new Rule<Float>();
    rule.operator(operator);
    rule.value(value);
    this.businessRuleFloat.add(attribute, rule);
  }

  public void addBusinessRules(String attribute, String operator, Double value) {
    if (this.businessRuleString.exist(attribute) || this.businessRuleInt.exist(attribute)
        || this.businessRuleFloat.exist(attribute)) {
      return;
    }

    Rule<Double> rule = new Rule<Double>();
    rule.operator(operator);
    rule.value(value);
    this.businessRuleDouble.add(attribute, rule);
  }

  public void DeleteBusinessRules(String attribute) {

    int result = this.businessRuleDouble.exist(attribute) ? 1
        : this.businessRuleFloat.exist(attribute) ? 2
            : this.businessRuleString.exist(attribute) ? 3
                : this.businessRuleInt.exist(attribute) ? 4 : 0;

    switch (result) {
      case 1:
        Rule<Double> rule = this.businessRuleDouble.getRule(attribute);
        this.businessRuleDouble.delete(attribute, rule);
        break;
      case 2:
        Rule<Float> ruleF = this.businessRuleFloat.getRule(attribute);
        this.businessRuleFloat.delete(attribute, ruleF);

        break;
      case 3:
        Rule<String> ruleS = this.businessRuleString.getRule(attribute);
        this.businessRuleString.delete(attribute, ruleS);

        break;
      case 4:
        Rule<Integer> ruleI = this.businessRuleInt.getRule(attribute);
        this.businessRuleInt.delete(attribute, ruleI);

        break;
      default:
        break;

    }

  }

  public void DeleteBusinessRules(String attribute, String operator, String value) {

    if (!this.businessRuleString.exist(attribute)) {
      return;
    }

    Rule<String> rule = new Rule<String>();
    rule.operator(operator);
    rule.value(value);
    businessRuleString.delete(attribute, rule);

  }

  public void DeleteBusinessRules(String attribute, String operator, Integer value) {

    if (!this.businessRuleInt.exist(attribute)) {
      return;
    }

    Rule<Integer> rule = new Rule<Integer>();
    rule.operator(operator);
    rule.value(value);
    businessRuleInt.delete(attribute, rule);
  }

  public void DeleteBusinessRules(String attribute, String operator, Float value) {
    if (!this.businessRuleFloat.exist(attribute)) {
      return;
    }

    Rule<Float> rule = new Rule<Float>();
    rule.operator(operator);
    rule.value(value);
    businessRuleFloat.delete(attribute, rule);
  }

  public void DeleteBusinessRules(String attribute, String operator, Double value) {
    if (!this.businessRuleDouble.exist(attribute)) {
      return;
    }

    Rule<Double> rule = new Rule<Double>();
    rule.operator(operator);
    rule.value(value);
    businessRuleDouble.delete(attribute, rule);
  }

  public void updateBusinessRules(String attribute, String operator, String value) {

    int result = this.businessRuleDouble.exist(attribute) ? 1
        : this.businessRuleFloat.exist(attribute) ? 2
            : this.businessRuleString.exist(attribute) ? 3
                : this.businessRuleInt.exist(attribute) ? 4 : 0;

    switch (result) {
      case 1:
        Rule<Double> rule = this.businessRuleDouble.getRule(attribute);
        this.businessRuleDouble.delete(attribute, rule);
        Rule<String> newRuleS = new Rule<String>();
        newRuleS.operator(operator);
        newRuleS.value(value);
        this.businessRuleString.add(attribute, newRuleS);

        break;
      case 2:
        Rule<Float> ruleF = this.businessRuleFloat.getRule(attribute);
        this.businessRuleFloat.delete(attribute, ruleF);
        Rule<String> newRuleS2 = new Rule<String>();
        newRuleS2.operator(operator);
        newRuleS2.value(value);
        this.businessRuleString.add(attribute, newRuleS2);

        break;
      case 3:
        Rule<String> ruleS = new Rule<String>();
        ruleS.operator(operator);
        ruleS.value(value);
        this.businessRuleString.update(attribute, ruleS);

        break;
      case 4:
        Rule<Integer> ruleI = this.businessRuleInt.getRule(attribute);
        this.businessRuleInt.delete(attribute, ruleI);
        Rule<String> newRuleS3 = new Rule<String>();
        newRuleS3.operator(operator);
        newRuleS3.value(value);
        this.businessRuleString.add(attribute, newRuleS3);

        break;
      default:
        break;
    }

  }

  public void updateBusinessRules(String attribute, String operator, Integer value) {

    int result = this.businessRuleDouble.exist(attribute) ? 1
        : this.businessRuleFloat.exist(attribute) ? 2
            : this.businessRuleString.exist(attribute) ? 3
                : this.businessRuleInt.exist(attribute) ? 4 : 0;

    switch (result) {
      case 1:
        Rule<Double> rule = this.businessRuleDouble.getRule(attribute);
        this.businessRuleDouble.delete(attribute, rule);
        Rule<Integer> newRuleI = new Rule<Integer>();
        newRuleI.operator(operator);
        newRuleI.value(value);
        this.businessRuleInt.add(attribute, newRuleI);

        break;
      case 2:
        Rule<Float> ruleF = this.businessRuleFloat.getRule(attribute);
        this.businessRuleFloat.delete(attribute, ruleF);
        Rule<Integer> newRuleI2 = new Rule<Integer>();
        newRuleI2.operator(operator);
        newRuleI2.value(value);
        this.businessRuleInt.add(attribute, newRuleI2);

        break;
      case 3:
        Rule<String> ruleS = this.businessRuleString.getRule(attribute);
        this.businessRuleString.delete(attribute, ruleS);
        Rule<Integer> newRuleI3 = new Rule<Integer>();
        newRuleI3.operator(operator);
        newRuleI3.value(value);
        this.businessRuleInt.add(attribute, newRuleI3);

        break;
      case 4:
        Rule<Integer> ruleI3 = new Rule<Integer>();
        ruleI3.operator(operator);
        ruleI3.value(value);
        this.businessRuleInt.update(attribute, ruleI3);

        break;
      default:
        break;
    }

  }

  public void updateBusinessRules(String attribute, String operator, Float value) {

    int result = this.businessRuleDouble.exist(attribute) ? 1
        : this.businessRuleFloat.exist(attribute) ? 2
            : this.businessRuleString.exist(attribute) ? 3
                : this.businessRuleInt.exist(attribute) ? 4 : 0;

    switch (result) {
      case 1:
        Rule<Double> rule = this.businessRuleDouble.getRule(attribute);
        this.businessRuleDouble.delete(attribute, rule);
        Rule<Float> newRuleF = new Rule<Float>();
        newRuleF.operator(operator);
        newRuleF.value(value);
        this.businessRuleFloat.add(attribute, newRuleF);
        break;
      case 2:
        Rule<Float> ruleFloat = new Rule<Float>();
        ruleFloat.operator(operator);
        ruleFloat.value(value);
        this.businessRuleFloat.update(attribute, ruleFloat);

        break;
      case 3:
        Rule<String> ruleS = this.businessRuleString.getRule(attribute);
        this.businessRuleString.delete(attribute, ruleS);
        Rule<Float> newRuleFloat2 = new Rule<Float>();
        newRuleFloat2.operator(operator);
        newRuleFloat2.value(value);
        this.businessRuleFloat.add(attribute, newRuleFloat2);

        break;
      case 4:
        Rule<Integer> ruleI = this.businessRuleInt.getRule(attribute);
        this.businessRuleInt.delete(attribute, ruleI);
        Rule<Float> newRuleFloat3 = new Rule<Float>();
        newRuleFloat3.operator(operator);
        newRuleFloat3.value(value);
        this.businessRuleFloat.add(attribute, newRuleFloat3);

        break;
      default:
        break;
    }
  }

  public void updateBusinessRules(String attribute, String operator, Double value) {

    int result = this.businessRuleDouble.exist(attribute) ? 1
        : this.businessRuleFloat.exist(attribute) ? 2
            : this.businessRuleString.exist(attribute) ? 3
                : this.businessRuleInt.exist(attribute) ? 4 : 0;

    switch (result) {
      case 1:
        Rule<Double> ruleDouble = new Rule<Double>();
        ruleDouble.operator(operator);
        ruleDouble.value(value);
        this.businessRuleDouble.update(attribute, ruleDouble);

        break;
      case 2:
        Rule<Float> ruleFl = this.businessRuleFloat.getRule(attribute);
        this.businessRuleFloat.delete(attribute, ruleFl);
        Rule<Double> newRuleDouble2 = new Rule<Double>();
        newRuleDouble2.operator(operator);
        newRuleDouble2.value(value);
        this.businessRuleDouble.add(attribute, newRuleDouble2);

        break;
      case 3:
        Rule<String> ruleS = this.businessRuleString.getRule(attribute);
        this.businessRuleString.delete(attribute, ruleS);
        Rule<Double> newRuleDouble3 = new Rule<Double>();
        newRuleDouble3.operator(operator);
        newRuleDouble3.value(value);
        this.businessRuleDouble.add(attribute, newRuleDouble3);

        break;
      case 4:
        Rule<Integer> ruleI = this.businessRuleInt.getRule(attribute);
        this.businessRuleInt.delete(attribute, ruleI);
        Rule<Double> newRuleDouble4 = new Rule<Double>();
        newRuleDouble4.operator(operator);
        newRuleDouble4.value(value);
        this.businessRuleDouble.add(attribute, newRuleDouble4);

        break;
      default:
        break;
    }

  }

  public void cleanAll() {

    this.businessRuleDouble.cleanAll();
    this.businessRuleFloat.cleanAll();
    this.businessRuleInt.cleanAll();
    this.businessRuleString.cleanAll();

  }

  // evalua si value cumple con la regla de nombre attribute
  public boolean validate(String attribute, String value) {

    if (this.businessRuleString.exist(attribute)) {
      Rule<String> r = this.businessRuleString.getRule(attribute);
      boolean response = false;
      switch (r.operator()) {
        case "=":
          response = r.value().equals(value);
          break;
        case "!=":
          response = !r.value().equals(value);
          break;
      }
      return response;
    }
    return false;
  }

  public boolean validate(String attribute, Integer value) {

    if (this.businessRuleInt.exist(attribute)) {
      Rule<Integer> r = this.businessRuleInt.getRule(attribute);
      boolean response = false;
      switch (r.operator()) {
        case "=":
          response = r.value().equals(value);
          break;
        case "!=":
          response = !r.value().equals(value);
          break;
        case "<":
          response = r.value() > value;
          break;
        case ">":
          response = (r.value() < value);
          break;
        case "<=":
          response = (r.value() <= value);
          break;
        case ">=":
          response = (r.value() >= value);
          break;
      }
      return response;
    }

    return false;

  }

  public boolean validate(String attribute, Double value) {

    if (this.businessRuleDouble.exist(attribute)) {
      Rule<Double> r = this.businessRuleDouble.getRule(attribute);
      boolean response = false;
      switch (r.operator()) {
        case "=":
          response = r.value().equals(value);
          break;
        case "!=":
          response = !r.value().equals(value);
          break;
        case "<":
          response = (r.value() > value);
          break;
        case ">":
          response = (r.value() < value);
          break;
        case "<=":
          response = (r.value() <= value);
          break;
        case ">=":
          response = (r.value() >= value);
          ;
          break;
      }
      return response;
    }
    return false;

  }

  public boolean validate(String attribute, Float value) {

    if (this.businessRuleFloat.exist(attribute)) {
      Rule<Float> r = this.businessRuleFloat.getRule(attribute);
      boolean response = false;
      switch (r.operator()) {
        case "=":
          response = r.value().equals(value);
          break;
        case "!=":
          response = !r.value().equals(value);
          break;
        case "<":
          response = (r.value() > value);
          break;
        case ">":
          response = (r.value() < value);
          break;
        case "<=":
          response = (r.value() <= value);
          break;
        case ">=":
          response = (r.value() >= value);
          break;

      }
      return response;
    }
    return false;
  }

  public void printRules() {
    this.businessRuleString.printRules();
    this.businessRuleInt.printRules();
    this.businessRuleDouble.printRules();
    this.businessRuleFloat.printRules();
  }

}
