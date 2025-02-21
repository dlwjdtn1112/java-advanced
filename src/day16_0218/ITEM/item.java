package day16_0218.ITEM;

import java.util.Scanner;

public class item {
     int id;
     String name;

    public item(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Item{id=" + id + ", name= " + name + "}";
    }
}

class CRUD{
    static Scanner sc = new Scanner(System.in);
    private static item[] i1 = new item[10];
    private static int count = 0;

    public static void createItem(int id,String name){
        if(count  < i1.length){
            i1[count++]  = new item(id,name);
            System.out.println("아이템 추가 완료");
        }
        else{
            System.out.println("배열이 가득 찼습니다.");
        }
    }


    public static void readItem(){
        System.out.println("현재 저장된 아이템 목록");

            for(int i = 0; i < count;i++){
                System.out.println("현재 아이템 아이디 : "+ i1[i].id + "현재 아이템 이름 : " + i1[i].name);
            }


    }


    public static void deleteItem(int id){

    }

    public static void updateItem(int input_id,String name){
        for(int i = 0; i < i1.length; i++){
            if(input_id == i1[i].getId()){
                i1[i].setId(input_id);
                i1[i].setName(name);
            }
        }
    }

    public static void main(String[] args) {
        createItem(1,"이정수1");
        createItem(2,"이정수2");
        createItem(3,"이정수3");
        readItem();
    }

}

