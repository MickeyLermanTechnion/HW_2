public class Clock {
    private int hours, minutes;
    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
    }
    //getters and setters
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

}
