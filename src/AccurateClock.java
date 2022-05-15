public class AccurateClock extends Clock {
    private int seconds;

    public AccurateClock(int hours, int minutes, int seconds){
        super(hours,minutes);
        this.seconds = seconds;
    }

    public AccurateClock(){
        this(0,0,0);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
