public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int timePassed){
        int timeLeft = expectedMinutesInOven() - timePassed;
        return timeLeft;
    }
    public int preparationTimeInMinutes(int layersCount){
        return layersCount * 2;
    }

    public int totalTimeInMinutes(int layersCount, int timePassed){
        int totalTime = preparationTimeInMinutes(layersCount) + timePassed;
        return totalTime;
    }
}
