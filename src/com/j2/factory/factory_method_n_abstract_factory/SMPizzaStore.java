package com.j2.factory.factory_method_n_abstract_factory;

public class SMPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new SMPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("SM Style Cheese Pizza");
        }
        else if(item.equals("potato")){
          pizza = new PotatoPizza(ingredientFactory);
          pizza.setName("SM Style Potato Pizza");
        }
        return pizza;
    }
}