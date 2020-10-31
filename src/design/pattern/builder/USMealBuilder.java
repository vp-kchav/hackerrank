package design.pattern.builder;

public class USMealBuilder implements MealBuilder{

    private Meal meal;

    public USMealBuilder() {
        meal = new Meal("this is US meal");
    }

    @Override
    public Meal getMeal() {
        return meal ;
    }

    @Override
    public void buildDrink() {
        Drink khmerDrink = new Drink("US drink");
        meal.setDrink(khmerDrink);
    }

    @Override
    public void buildMainDish() {
        MainDish khmerMainDish = new MainDish("US main dish");
        meal.setMainDish(khmerMainDish);
    }
}
