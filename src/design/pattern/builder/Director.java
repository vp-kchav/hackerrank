package design.pattern.builder;

public class Director {
    MealBuilder mealBuilder;

    public Director(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainDish();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }
}
