public class FreightVehicle {
    String licencePLate;
    int volume;
    int maxWeight;
    float avgSpeed;

    public float returnTravelTime(Path path) {
        float travelTime = path.distance/avgSpeed/24;
        return travelTime;
    }

    public FreightVehicle() {
    }

    public FreightVehicle(String licencePLate, float avgSpeed) {
        this.licencePLate = licencePLate;
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
}

