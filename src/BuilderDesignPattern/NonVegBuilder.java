package BuilderDesignPattern;

public class NonVegBuilder extends MealBuilder {

   private Meal meal;

   public NonVegBuilder(){
       meal= new Meal();
   }

    @Override
    public void addBuriyani(){this.meal.setBiriyani("NonVeg");}

    @Override
    public void addBread() {
        this.meal.setBread("Roti");
    }

    @Override
    public void addCool() {
        this.meal.setCoolDrink("Coca Cola");
    }

    @Override
    public void addCurry() {
        this.meal.setCurry("NonVeg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
