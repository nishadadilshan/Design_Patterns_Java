package BuilderDesignPattern;

public class VegeMealBuilder extends MealBuilder{
    private Meal meal;

    public VegeMealBuilder(){ meal = new Meal();}

    @Override
    public void addBuriyani(){this.meal.setBiriyani("Veg");}

    @Override
    public void addBread() {
        this.meal.setBread("Naan");
    }

    @Override
    public void addCool() {
        this.meal.setCoolDrink("Sprite");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
