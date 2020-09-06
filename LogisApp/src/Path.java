public class Path {
    Shop shop;
    Warehouse warehouse;
    int distance;

    public Path() {
    }

    public Path(Shop shop, Warehouse warehouse, int distance) {
        this.shop = shop;
        this.warehouse = warehouse;
        this.distance = distance;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Path{" +
                "shop=" + shop +
                ", warehouse=" + warehouse +
                ", distance=" + distance +
                '}';
    }
}
