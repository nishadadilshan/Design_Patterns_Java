package BuilderDesignPattern;

public abstract class MealBuilder {

    public abstract void addBuriyani();
    public abstract void addBread();
    public abstract void addCool();
    public abstract void addCurry();
    public abstract Meal build();

}
