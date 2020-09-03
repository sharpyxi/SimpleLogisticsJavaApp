import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Location shopLocation = new Location();
        Location warehouseLocation = new Location();
        Shop shop = new Shop();
        Warehouse warehouse = new Warehouse();
        FreightVehicle truck = new FreightVehicle();
        Path path = new Path(shop, warehouse, 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Shop name: ");
        shop.shopName = sc.nextLine();
        System.out.println("Enter Shop city: ");
        shopLocation.city = sc.nextLine();
        System.out.println("Enter Shop country: ");
        shopLocation.country = sc.nextLine();

        System.out.println("Enter Warehouse name: ");
        warehouse.warehouseName = sc.nextLine();
        System.out.println("Enter Warehouse city: ");
        warehouseLocation.city = sc.nextLine();
        System.out.println("Enter Warehouse country: ");
        warehouseLocation.country = sc.nextLine();

        System.out.println("Enter average speed: ");
        truck.avgSpeed = sc.nextFloat();
        System.out.println("Enter path distance: ");
        path.distance = sc.nextInt();

        System.out.println(shop.shopName);
        System.out.println(shopLocation.city);
        System.out.println(shopLocation.country);

        System.out.println(warehouse.warehouseName);
        System.out.println(warehouseLocation.city);
        System.out.println(warehouseLocation.country);

        System.out.println(truck.returnTravelTime(path));
        System.out.println(path.shop.toString()
        );
        System.out.println(path.warehouse.getWarehouseLocation());

    }
}
