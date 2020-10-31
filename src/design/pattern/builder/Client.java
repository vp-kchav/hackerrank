package design.pattern.builder;

public class Client {

    public static void main(String []arg) {
        Director khmerDirector = new Director(new KhmerMealBuilder());
        Director usDirector = new Director(new USMealBuilder());

        khmerDirector.constructMeal();
        Meal khmerMeal = khmerDirector.getMeal();

        System.out.println(khmerMeal);

        usDirector.constructMeal();
        Meal usMeal = usDirector.getMeal();
        System.out.println(usMeal);
    }
}
