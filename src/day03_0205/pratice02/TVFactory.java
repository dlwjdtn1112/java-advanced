package day03_0205.pratice02;

public class TVFactory extends Factory implements IWorkingTogether{

    TVFactory(String name,int openHour,int closeHour){
        this.name = name;
        this.openHour = openHour;
        this.closeHour = closeHour;
    }




    public int makeProduce(char skill) {
        if(skill =='A'){
            return 8 * getWorkingTime();
        }
        else if(skill == 'B'){
            return 5 * getWorkingTime();
        }
        else if(skill == 'C'){
            return 3 * getWorkingTime();
        }
        else{
            return 0;
        }

    }
    public int workTogether(IWorkingTogether parther){
        return 3 * this.getWorkingTime();

    }
}
