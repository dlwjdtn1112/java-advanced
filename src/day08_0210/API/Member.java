package day08_0210.API;
//객체 동등비교
public class Member extends Object{
    //String id ;
    String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {//equals를 재정의
        if(obj instanceof Member target){//obj Member타입인지 검사하고 타입변환 후 target변수에 대입
            if(name.equals(target.name)){ // id문자열이 같은지 비교
                return true;
            }
        }
        return false; // 같지 않으면 false를 리턴
    }
//    if(this == obj) return true
//    if(obj == null) return true;
//    Member member  = (Member)obj;
}
