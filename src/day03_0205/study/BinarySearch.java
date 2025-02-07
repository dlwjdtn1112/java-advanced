package day03_0205.study;


import java.util.Scanner;

//이진 검색
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("몇개의 데이터를 반환?");
        int number = in.nextInt();
        int[] array = new int[number];
        System.out.println("오름차순으로 하라");
        System.out.println("array[0] : ");
        array[0] = in.nextInt();

        for(int i = 1; i < number;i++){
            do{
                System.out.print("array[" + i +"] :");
                array[i] = in.nextInt();
            }while(array[i] < array[i-1]); //오름차순 정렬
        }
        for(int data : array) System.out.print(data+ " ");

    }

    static int binSearch(int[] array,int number,int key){
        int pl = 0; //검색 범위의 첫 인덱스
        int pr = number - 1; //검색 범위의 끝 인덱스

        do{
            int pc = (pl+pr) / 2; //중앙 요소 인덱스
            if(array[pc] == key) return pc;
            else if(array[pc] < key) pl = pc + 1;
            else pr = pc - 1; //검색 범위를 앞쪽 절반으로
        }while(pl <= pr);
        return -1; // 검색실패

    }
}
