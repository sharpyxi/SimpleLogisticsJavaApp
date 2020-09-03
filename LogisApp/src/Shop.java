public class Shop {
    String shopName;
    Location shopLocation;

    public Shop() {
    }

    public Shop(String shopName, Location shopLocation) {
        this.shopName = shopName;
        this.shopLocation = shopLocation;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Location getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(Location shopLocation) {
        this.shopLocation = shopLocation;
    }
}
