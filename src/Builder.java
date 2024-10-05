// House class with a nested Builder class
class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    private House(Builder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House [Rooms: " + numRooms + ", Floors: " + numFloors +
                ", Pool: " + hasPool + ", Garage: " + hasGarage + "]";
    }

    public static class Builder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public Builder numRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public Builder numFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public Builder hasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
public class Builder{
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .numRooms(3)
                .numFloors(2)
                .hasPool(true)
                .hasGarage(false)
                .build();
        System.out.println(house1);

        House house2 = new House.Builder()
                .numRooms(4)
                .numFloors(1)
                .hasPool(false)
                .hasGarage(true)
                .build();
        System.out.println(house2);
    }
}
