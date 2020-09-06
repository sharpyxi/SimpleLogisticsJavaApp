import java.util.Date;

public class Food {
    String foodName;
    int volume;
    int weight;
    Date expirationDate;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", volume=" + volume +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                '}';
    }
}


