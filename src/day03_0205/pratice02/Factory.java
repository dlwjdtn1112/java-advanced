package day03_0205.pratice02;

public abstract class Factory {
    int openHour;
    int closeHour;
    String name;

    Factory(){}
    Factory(String name,int openHour,int closeHour){
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }
    public String getFactoryName(){
        return this.name;
    }
    public int getWorkingTime(){
        return this.closeHour-this.openHour;
    }

    public abstract int makeProduce(char skill);

}
