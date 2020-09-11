import java.time.LocalDate;
import java.time.LocalDateTime;

public class Food {
    String foodName;
    int volume;
    int weight;
    LocalDate expirationDate;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public Food(String foodName, int volume, int weight, LocalDate expirationDate) {
        this.foodName = foodName;
        this.volume = volume;
        this.weight = weight;
        this.expirationDate = expirationDate;
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

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}


