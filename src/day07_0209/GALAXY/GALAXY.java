package day07_0209.GALAXY;

public class GALAXY {
    int year;
    String name;

    GALAXY(){}
    GALAXY(int year,String name){
        this.year = year;
        this.name = name;
    }

    public void show(){
        System.out.println("갤럭시의 출시년도 : " + year + "모델명 : " + name);
    }

    public void GALAXY_SEE(GALAXY galaxy){
        System.out.println("갤럭시 핸드폰 정보 :  " + galaxy.year + galaxy.name);
    }
}
