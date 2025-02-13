package day11_0213.TreeSet;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Synchron {
    public static void main(String[] args) {
        Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());//완볍하게 map에 객체 저장
        Map<Integer,String> map1 = new HashMap<>();//스레드들의 경쟁

        Thread treadA = new Thread(){
            @Override
            public void run() {
                //객체 1000추가
                for(int i = 1; i < 1000;i++){
                    map.put(i,"내용" + i);
                }
            }

        } ;

        Thread treadB = new Thread(){
            @Override
            public void run() {
                //객체 1000추가
                for(int i = 1000; i <= 2000;i++){
                    map.put(i,"내용" + i);
                }
            }

        } ;

        //작업 스레드 진행
        treadA.start();
        treadB.start();

        //작업 스레드들이 모도 종료될때 까지 스레드를 가더라개 한것임.

        try{
            treadA.join();
            treadB.join();
        }
        catch (InterruptedException e){
            System.out.println("외부 문제로 프로그램 종료");
        }
        catch (Exception e1){
            e1.printStackTrace();
        }

        //저장돤 총 객체 수 받기
        int size = map.size();
        System.out.println("총 객체 수 : " + size);


    }
}
