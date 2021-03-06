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

    /**
     * create a String representation in the format: HH:MM:SS
     * @return String representing the AccurateClock
     */
    @Override
    public String toString(){
        if(this.seconds > 9) //if num of seconds is lower than 9 we need to add 0 before it to keep the format
            return super.toString() + ":" + this.seconds;
        return super.toString() + ":0" + this.seconds;
    }

    /**
     * determines if the objects are equals based on them being both AccurateClock type
     * and their values of "hours", "minutes" and "seconds" being equal
     * @param other
     * @return true if the objects are equal and false otherwise
     */
    @Override
    public boolean equals(Object other){
        if(other==this) {return true;}
        if(!(other instanceof AccurateClock)) {return false;}
        AccurateClock otherAccurateClock = (AccurateClock) other;
        return (super.equals(other) && this.seconds == otherAccurateClock.getSeconds());
    }

    /**
     * using the hashCode of the super class to calculate the number of seconds from midnight.
     * that way two clocks with the same time value will have a unique, shared hash code.
     * @return number of seconds from midnight.
     */
    @Override
    public int hashCode(){
        return super.hashCode()*60 + this.seconds;
    }
}
