package main.java.org.pizza.especialidades;


import main.java.org.pizza.base.*;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana (String name, double price, String Salsa, Topping... toppings){
        super(name, price,toppings);
		this.salsa=salsa;}

    public String  getSalsa(){
        return salsa;
    }

    public void addTopping(Topping tomato) {
    }
}

