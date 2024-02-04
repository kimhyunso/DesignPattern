package 팩토리패턴;

import 심플팩토리패턴.domain.Pizza;
import 팩토리패턴.NYPizza.NYCheesePizza;
import 팩토리패턴.NYPizza.NYClamPizza;
import 팩토리패턴.NYPizza.NYPepperoniPizza;
import 팩토리패턴.NYPizza.NYVeggiePizza;

public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYCheesePizza();
        }else if (type.equals("pepperoni")){
            return new NYPepperoniPizza();
        }else if (type.equals("clam")){
            return new NYClamPizza();
        }else if (type.equals("veggie")){
            return new NYVeggiePizza();
        } else return null;
    }
}
