package day03_0205.study;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("몇개의 데이터를 입력하시겠습니까?");
        int number = in.nextInt();

        int[] arr = new int[number+1];
        for(int i = 0;i < arr.length-1;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("검색할 값 : ");
        int key = in.nextInt();
        int idx = seqSearch(arr,number,key);
        System.out.println(idx);



    }
    static int seqSearch(int[]arr,int num,int key){
        int i = 0;
        arr[num] = key;

        while(true){
            if(i == num) return -1;//검색 실패
            if(arr[i] == key){
                break;
                //return 1;
                //검색 성공
            }
            i++;
        }
        return i == num ? -1 : i;
    }


}
//보초법