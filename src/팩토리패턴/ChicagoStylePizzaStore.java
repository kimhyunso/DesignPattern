package 팩토리패턴;

import 심플팩토리패턴.domain.Pizza;
import 팩토리패턴.NYPizza.NYCheesePizza;
import 팩토리패턴.NYPizza.NYClamPizza;
import 팩토리패턴.NYPizza.NYPepperoniPizza;
import 팩토리패턴.NYPizza.NYVeggiePizza;
import 팩토리패턴.chicagoPizza.ChicagoCheesePizza;
import 팩토리패턴.chicagoPizza.ChicagoClamPizza;
import 팩토리패턴.chicagoPizza.ChicagoPepperoniPizza;
import 팩토리패턴.chicagoPizza.ChicagoVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoCheesePizza();
        }else if (type.equals("pepperoni")){
            return new ChicagoPepperoniPizza();
        }else if (type.equals("clam")){
            return new ChicagoClamPizza();
        }else if (type.equals("veggie")){
            return new ChicagoVeggiePizza();
        } else return null;
    }
}
