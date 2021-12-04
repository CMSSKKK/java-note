package item2;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NutritionFactsWithBuilder cocaCola = new NutritionFactsWithBuilder.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }
}
