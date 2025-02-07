package day01_0203;

public class intArrayQueue {
    //멤버 (필드) index
    private int[] que; //큐의 데이터 저장소
    private int capacity;//큐의 용량
    private int num; //현재 데이터 개수

    //생성자
    public intArrayQueue(int capacity){
        this.num = 0;
        this.capacity = capacity;
        try{
            que = new int[this.capacity];
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //기능 (메소드) popleft(),append()
    public class EmptyIntArrayQueueException extends RuntimeException{
        public EmptyIntArrayQueueException(){}
    }
    public class OverflowIntArrayQueueException extends RuntimeException{
        public OverflowIntArrayQueueException(){}
    }

//    public int enque(int x) throws Exception{
//        if(this.num >= this.capacity)throw OverflowIntArrayQueueException {
//            throw new OverflowIntArrayQueueException();
//            que[num++] = x;
//            return x;
//
//        }
//
//    }

    public int deque() throws EmptyIntArrayQueueException {
        if (num <= 0) throw new EmptyIntArrayQueueException();
        int x = que[0];
        for (int i = 0; i < num - 1; i++) {
            que[i] = que[i + 1];
            num--;
            //return x;
        }
        return x;
    }

    public int peek() throws EmptyIntArrayQueueException{
        if(num <= 0) throw new EmptyIntArrayQueueException();
        return que[num-1];
    }

    //큐를 비운다.
    public void clear(){
        num = 0;
    }

    //큐에서 x를 검색하여 발견하지 못하면 -1 반한하는 indexOf()기능을 구현

    public int indexOf(int x){
        for(int i = 0; i < num;i++){
            if(que[i]==x)
                return i;
        }
        return -1;
    }
    public int capacity(){
        return this.capacity;
    }
    //큐가 비어 있는지 확인 boolean isEmpty()
    public boolean isEmpty(){
        return num <=0;
    }

    public void dump(){
        if(num <=0) System.out.println("Empty");
        else{
            for(int data : que) System.out.print(data+" ");
            System.out.println();
        }
    }

    public int size(){
        return num;
    }

    public boolean isFull(){
        return num >= capacity;
    }

}
