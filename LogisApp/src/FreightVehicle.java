import java.util.List;

public abstract class FreightVehicle {
    String licencePLate;
    int volume;
    int maxWeight;
    float avgSpeed;
    List<Food> cargo;

    public float returnTravelTime(Path path) {
        return path.distance/avgSpeed/24;
    }

    public FreightVehicle() {
    }

    public FreightVehicle(String licencePLate, float avgSpeed) {
        this.licencePLate = licencePLate;
        this.avgSpeed = avgSpeed;
    }

    public FreightVehicle(String licencePLate, int volume, int maxWeight, float avgSpeed) {
        this.licencePLate = licencePLate;
        this.volume = volume;
        this.maxWeight = maxWeight;
        this.avgSpeed = avgSpeed;
    }

    public String getLicencePLate() {
        return licencePLate;
    }

    public void setLicencePLate(String licencePLate) {
        this.licencePLate = licencePLate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public float getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(float avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    @Override
    public String toString() {
        return "FreightVehicle{" +
                "licencePLate='" + licencePLate + '\'' +
                ", volume=" + volume +
                ", maxWeight=" + maxWeight +
                ", avgSpeed=" + avgSpeed +
                '}';
    }

    public void loadFood(Food food) {
        cargo.add(food);
    }

    public void unloadFood(Food food) {
        cargo.remove(food);
    }

    public double returnOccupancy() {
        return cargo.size()/volume;
    }

    public abstract int returnCapacity();

}

