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

    public String toString(int hours, int minutes){
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

    public boolean equals(Object o){
        if (this == o) return true;
        if(this instanceof Clock && this.toString().length()==o.toString().length()){
            Clock other = (Clock)o;
            if(this.hours==other.getHours() && this.minutes==other.getMinutes() ){
                return true;

            }
        }return false;
   }
}
