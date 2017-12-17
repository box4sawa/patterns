package patterns.factory.factory_method.pizza;

public abstract class Pizza {
    public final String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing pizza");
        System.out.println("Adding sauce");
        System.out.println("Tossing dough");
        System.out.println("Adding toppings");
    }

    public void bake() {
        System.out.println("Bake pizza for 25 mins at 360 degrees");
    }

    public void cut() {
        System.out.println("Cut pizza onto slices");
    }

    public void box() {
        System.out.println("Box pizza");
    }

}
