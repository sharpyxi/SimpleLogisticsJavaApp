import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    String warehouseName;
    Location warehouseLocation;
    int capacity;
    Food food;
    List<Food> inventory = new ArrayList<>();


    public Warehouse() {
    }

    private Warehouse(String warehouseName, Location warehouseLocation) {
        this.warehouseName = warehouseName;
        this.warehouseLocation = warehouseLocation;
    }

    private Warehouse(String warehouseName, Location warehouseLocation, int capacity) {
        this.warehouseName = warehouseName;
        this.warehouseLocation = warehouseLocation;
        this.capacity = capacity;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Location getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(Location warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouseName='" + warehouseName + '\'' +
                ", warehouseLocation=" + warehouseLocation +
                ", food=" + food +
                ", capacity=" + capacity +
                ", inventory=" + inventory +
                '}';
    }

    public void addFood(Food food) {
        inventory.add(food);
    }

    public void removeFood(Food food) {
        inventory.remove(food);
    }

    public int returnFoodQuantity() {
        return inventory.size();
    }

    public boolean foodExists (Food food) {
        boolean containsFood;
        containsFood = inventory.contains(food.foodName);
        return containsFood;
    }
}
