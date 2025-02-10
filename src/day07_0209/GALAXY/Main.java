package day07_0209.GALAXY;

public class Main {
    // static final day07_0209.GALAXY.GALAXY_SEE GALAXY_SEE = ;

    public static void main(String[] args) {
        GALAXY[] galaxy = new GALAXY[3];


        galaxy[0] = new GALAXY(2025,"s25");
        galaxy[1] = new GALAXY(2024,"s24");
        galaxy[2] = new GALAXY(2023,"s23");

        for(GALAXY galaxy1 : galaxy){
            galaxy1.GALAXY_SEE(galaxy1);
        }

        System.out.println("------");

        GALAXY_FE[] galaxy_fe = new GALAXY_FE[3];

        galaxy_fe[0] = new GALAXY_FE(2024,"s24Fe","엑시노스");
        galaxy_fe[1] = new GALAXY_FE(2023,"s23Fe","엑시노스");
        galaxy_fe[2] = new GALAXY_FE(2022,"s22Fe","엑시노스");

        for(GALAXY_FE i :galaxy_fe){
            i.show();
        }

        GALAXY_SEE a1 = new GALAXY_SEE();
        a1.GALAXY_SEE1(galaxy[0]);








    }
}
