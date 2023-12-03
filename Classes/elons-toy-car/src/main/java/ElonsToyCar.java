public class ElonsToyCar {
    private int distanceDriven;
    private int batteryLeft;

    public ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryLeft = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        String batteryStatus = this.batteryLeft > 0 ? ("at " + this.batteryLeft + "%") : "empty";

        return "Battery " + batteryStatus;
    }

    public void drive() {
        if (this.batteryLeft > 0) {
            this.distanceDriven += 20;
            this.batteryLeft -= 1;
        }
    }
}
