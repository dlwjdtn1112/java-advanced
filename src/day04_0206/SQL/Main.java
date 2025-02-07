package day04_0206.SQL;

public class Main {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void main(String[] args) {
        dbWork(new Mysql());

        dbWork(new Oracle());

    }
}
