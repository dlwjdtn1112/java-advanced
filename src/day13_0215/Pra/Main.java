package day13_0215.Pra;

import java.util.ArrayList;

class GALAXY{
    String model;
    int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public GALAXY(String model,int year) {
        this.model = model;
        this.year = year;

    }

    public void display(){
        System.out.println("모델명 : "+ this.model + " 줄시연도 : "+ this.year);
    }
}

public class Main {
    public static void main(String[] args) {


        ArrayList<GALAXY> galaxy = new ArrayList<>();
        galaxy.add(new GALAXY("s25",2025));
        galaxy.add(new GALAXY("s24FE",2024));
        galaxy.add(new GALAXY("s23",2023));
        galaxy.add(new GALAXY("21",2021));
        galaxy.add(new GALAXY("23+",2023));
        for(GALAXY g : galaxy){
            g.display();
        }



    }

}
