import BuilderDesignPattern.Burger;
import BuilderDesignPattern.Meal;
import BuilderDesignPattern.MealDirector;
import BuilderDesignPattern.VegeMealBuilder;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        // create the burger class.
        Burger burger = new Burger.BurgerBuilder()
                .size("Large")
                .egg(true)
                .mayonese(false)
                .cheese(true)
                .build();
        Meal meal = new MealDirector(new VegeMealBuilder()).prepareMeal();


    }

}