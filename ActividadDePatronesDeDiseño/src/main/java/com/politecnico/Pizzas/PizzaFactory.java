package com.politecnico.Pizzas;

public class PizzaFactory {
    public static final int CUATRO_ESTACIONES = 0;
    public static final int MARGARITA = 1;
    public static final int PROSCIUTTO = 2;
    public static final int VEGANA = 3;

    public Pizza crearPizza(int tipoDePizza){
        Pizza pizza = null;
        switch (tipoDePizza){
            case Pizza.ESTACIONES:
                pizza = new Pizza4Estaciones();
                break;
            case Pizza.MARGARITA:
                pizza = new PizzaMargarita();
                break;
            case Pizza.PROSCIUTTO:
                    pizza = new PizzaProsciutto();
                    break;
            case  Pizza.VEGANA:
                pizza = new PizzaMargarita();
                break;
            default:
                pizza = new PizzaMargarita();

        }
        return pizza;
    }
}
