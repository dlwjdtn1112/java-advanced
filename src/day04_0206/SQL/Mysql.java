package day04_0206.SQL;

public class Mysql implements DataAccessObject{
//    public void dbWork(DataAccessObject dao){
//        dao.select();
//        dao.insert();
//        dao.select();
//        dao.select();
//
//    }
    public void select(){
        System.out.println("sql DB에서 검색");

    }
    public void insert(){
        System.out.println("sql DB에서 삽입");

    }
    public void update(){
        System.out.println("sql DB에서 수정");

    }
    public void delete(){
        System.out.println("sql DB에서 삭제");

    }
}
