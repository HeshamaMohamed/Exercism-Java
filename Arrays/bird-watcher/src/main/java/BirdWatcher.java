
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int todaysIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.todaysIndex = this.birdsPerDay.length - 1;
    }

    public int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        int[] lastWeekVisits = {0, 2, 5, 3, 7, 8, 4};
        return lastWeekVisits;
    }

    public int getToday() {
        return this.birdsPerDay[this.todaysIndex];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.todaysIndex] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasZeroVisits = false;

        for(int visitsCount: this.birdsPerDay){
            if (visitsCount == 0){
                hasZeroVisits = true;
                break;
            }
        }

        return hasZeroVisits;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int visitsCount = 0;

        if (numberOfDays > 7){
            numberOfDays = 7;
        }

        for(int day=0; day < numberOfDays; day++){
            visitsCount += this.birdsPerDay[day];
        }

        return visitsCount;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;

        for(int visitsCount: this.birdsPerDay){
            if (visitsCount >= 5){
                busyDaysCount++;
            }
        }

        return busyDaysCount;
    }
}
