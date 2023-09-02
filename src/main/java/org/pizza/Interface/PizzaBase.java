package main.java.org.pizza.Interface;

public class PizzaBase implements IPreparable {
    private String nombre;
    private double precio;
    public PizzaBase(String n, double p){
        this.nombre=n;
        this.precio=p;
}
    @Override
    public void prepare(){
        System.out.println("Preparando la pizza..");
        System.out.println("la pizza está lista!!!");

    }
}
