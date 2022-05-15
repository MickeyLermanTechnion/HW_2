public class AccurateClock extends Clock {
    private int seconds;

    public AccurateClock(int hours, int minutes, int seconds){
        super(hours,minutes);
        if(seconds<0 || seconds>59){seconds = 0;}
        this.seconds = seconds;
    }

    public AccurateClock(){
        this(0,0,0);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds<0 || seconds>59){seconds = 0;}
        this.seconds = seconds;
    }

    @Override
    public String toString(){
        if(this.seconds > 9)
            return super.toString() + ":" + this.seconds;
        return super.toString() + ":0" + this.seconds;
    }

    @Override
    public boolean equals(Object other){
        if(other==this) {return true;}
        if(other == null || !(other instanceof AccurateClock)) {return false;}
        AccurateClock otherAccurateClock = (AccurateClock) other;
        return (super.equals(other) && this.seconds == otherAccurateClock.getSeconds());
    }
}
