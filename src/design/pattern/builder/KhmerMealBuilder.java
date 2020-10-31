package design.pattern.builder;

public class KhmerMealBuilder implements MealBuilder{

    private Meal meal;

    public KhmerMealBuilder() {
        meal = new Meal("this is Khmer meal");
    }

    @Override
    public Meal getMeal() {
        return meal ;
    }

    @Override
    public void buildDrink() {
        Drink khmerDrink = new Drink("khmer drink");
        meal.setDrink(khmerDrink);
    }

    @Override
    public void buildMainDish() {
        MainDish khmerMainDish = new MainDish("khmer main dish");
        meal.setMainDish(khmerMainDish);
    }
}
