package day03_0205.pratice02;

public class CarFactory extends Factory {
    CarFactory(String name, int openHour, int closeHour) {
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }

    public int makeProduce(char skill) {
        if(skill =='A'){
            return 3 * getWorkingTime();
        }
        else if(skill == 'B'){
            return 2 * getWorkingTime();
        }
        else if(skill == 'C'){
            return  getWorkingTime();
        }
        else{
            return 0;
        }

    }
    public int workTogether(IWorkingTogether parther){
        return 2 * this.getWorkingTime();

    }

}
