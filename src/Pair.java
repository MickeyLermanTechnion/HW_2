public class Pair<T>{
    T first,second;

    public void Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }
    public T getSecond(){
        return this.second;
    }

    public void setPair(T first, T second){
        this.first=first;
        this.second=second;
    }

}
