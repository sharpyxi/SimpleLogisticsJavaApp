import java.util.ArrayList;

public class Warehouse {
    String warehouseName;
    Location warehouseLocation;
    Food food;
    int capacity;
    ArrayList<Food> inventory;

    public Warehouse() {
    }

    public Warehouse(String warehouseName, Location warehouseLocation) {
        this.warehouseName = warehouseName;
        this.warehouseLocation = warehouseLocation;
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

    public int returnFoodQuantity(Food food) {
        return inventory.size();
    }

    public boolean foodExists (Food food) {
        boolean containsFood = false;
        if (inventory.contains(food)) {
            containsFood = true;
        }
        return containsFood;
    }
}
