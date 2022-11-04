package logic;

public class Dish {

    private String id;

    private String name;

    private boolean isVegetarian;

    private int calories;

    private double value;

    public Dish(String id, String name, boolean isVegetarian, int calories, double value) {
        this.id = id;
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.calories = calories;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", isVegetarian=" + isVegetarian +
                ", calories=" + calories +
                ", value=" + value +
                '}';
    }
}
