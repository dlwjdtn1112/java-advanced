package day04_0206.SQL;

public class Oracle implements DataAccessObject{
    public void select(){
        System.out.println("oracle DB에서 검색");

    }
    public void insert(){
        System.out.println("oracle DB에서 삽입");

    }
    public void update(){
        System.out.println("oracle DB에서 수정");

    }
    public void delete(){
        System.out.println("oracle DB에서 삭제");

    }
}
