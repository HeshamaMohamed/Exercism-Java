class NeedForSpeed {
    private int speed;
    private int batteryLeft;
    private int batteryDrain;
    private int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryLeft = 100;
    }

    public boolean batteryDrained() {
        return this.batteryLeft < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()){
            this.distanceDriven += this.speed;
            this.batteryLeft -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }

        return car.distanceDriven() >= this.distance;
    }
}
