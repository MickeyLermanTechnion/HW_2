public class Clock {
    private int hours, minutes;
    public Clock(int hours, int minutes){
        if( minutes > 59 || minutes<0){
            minutes=0;
        }
        if( hours > 24 || hours<0){
            hours =0;
        }
        this.hours = hours;
        this.minutes = minutes;
    }
    //getters and setters
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        if( hours > 24 || hours<0){
            this.hours = 0;
        }
        this.hours = hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        if( minutes > 59 || minutes<0){
            this.minutes = 0;
        }
        this.minutes = minutes;
    }

    /**
     * @return String describing the clock in the format HH:MM(H - hours, M - minutes)
     */
    @Override
    public String toString(){
        if (hours>9){
            if(minutes>9) {
                return this.hours +":"+this.minutes;
            }
            else{
                return this.hours +":0"+this.minutes;
            }
        }
        else {
            if(minutes>9) {
            return "0"+ this.hours +":"+this.minutes;
        }
        else{
            return "0"+ this.hours +":0"+this.minutes;
        }
        }
    }

    /**
     * compares based on HashCode and the values of "hours" and "minutes"
     * @param o
     * @return true if the objects have the same HashCode and compared values, else false
     */
    @Override
    public boolean equals(Object o){
        if(this == null) {return false;}
        if (this == o) {return true;}
        if(o instanceof Clock && this.hashCode() == o.hashCode()){
            Clock other = (Clock)o;
            if(this.hours==other.getHours() && this.minutes==other.getMinutes() ){
                return true;

            }
        }return false;
   }

    /** hashCode
     *
     * @return number of minutes pass 00:00 o'clock
     */
   @Override
   public int hashCode() {
        return 60 * hours + minutes;
   }
}
