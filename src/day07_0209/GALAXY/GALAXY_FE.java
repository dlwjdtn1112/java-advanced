package day07_0209.GALAXY;

public class GALAXY_FE extends GALAXY{
    String cpu = "엑시노스FE";

    GALAXY_FE(){}
    GALAXY_FE(int year,String name,String cpu){
        super(year,name);
        this.cpu = cpu;
    }
}
