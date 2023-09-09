package BuilderDesignPattern;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addBread();
        mealBuilder.addBuriyani();
        mealBuilder.addCool();
        mealBuilder.addCurry();

        return mealBuilder.build();
    }

}
