public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int productionRatePerSpeedUnit = 221;
        double productionRate = 0;

        if (speed <= 4){
            productionRate = speed * productionRatePerSpeedUnit;
        } else if (speed <= 8){
            productionRate = (speed * productionRatePerSpeedUnit) * 0.9;
        } else if (speed == 9){
            productionRate = (speed * productionRatePerSpeedUnit) * 0.8;
        } else if (speed == 10){
            productionRate = (speed * productionRatePerSpeedUnit) * 0.77;
        }

        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        int productionRate = (int)productionRatePerHour(speed);
        return productionRate / 60;
    }
}
