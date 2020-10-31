package design.pattern.builder;

public interface MealBuilder {
    Meal getMeal();
    void buildDrink();
    void buildMainDish();
}
