import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int randomIndex = this.random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[randomIndex];
    }

    String randomShipRegistryNumber() {
        String registeryPrefix = "NCC-";
        int registeryNumber = 1000 + this.random.nextInt(9000);

        return registeryPrefix + registeryNumber;
    }

    double randomStardate() {
        double randomDate = 41000.00 + (1000.00 * this.random.nextDouble());

        return randomDate;
    }
}
