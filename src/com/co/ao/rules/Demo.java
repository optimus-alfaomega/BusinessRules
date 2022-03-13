package com.co.ao.rules;

public class Demo {
    public static void main(String[] args) {

        ControlBusinessRule ctm = new ControlBusinessRule();

        ctm.addBusinessRules("iva", "=", 19); // add una regla entera
        ctm.addBusinessRules("salarioMinimo", "!=", 1000000F); // add una regla flotante
        ctm.addBusinessRules("m", "!=", "100cm"); // add una regla string
        ctm.printRules(); // imprimir las reglas existentes
        System.out.println(ctm.validate("salarioMinimo", 1000F)); // validar que se cumpla una regla
        System.out.println("----------------------------------");
        ctm.updateBusinessRules("iva", "=", 20); // actualizar una regla
        ctm.printRules(); // imprimir reglas
        System.out.println("----------------------------------");
        ctm.DeleteBusinessRules("iva"); // borrar una regla
        ctm.printRules();
        System.out.println("----------------------------------");
        ctm.DeleteBusinessRules("salarioMinimo");
        ctm.printRules();
        System.out.println("----------------------------------");
        ctm.DeleteBusinessRules("m");
        ctm.printRules();
        System.out.println("----------------------------------");

    }
}
