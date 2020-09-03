public class Warehouse {
    String warehouseName;
    Location warehouseLocation;

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
}
