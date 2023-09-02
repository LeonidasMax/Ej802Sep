package main.java.org.pizza.example;

import main.java.org.pizza.base.Topping;
import main.java.org.pizza.especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {
        PizzaItaliana pizza = new PizzaItaliana("Pizza Marguerita", 10.99, "Tou Island");
        pizza.addTopping(new Topping("tomato"));
        pizza.addTopping(new Topping("Mozarella"));
        pizza.addTopping(new Topping("Champinon"));
        pizza.prepare();
        System.out.println("This is the Salsa: "+pizza.getSalsa());
    }
}
