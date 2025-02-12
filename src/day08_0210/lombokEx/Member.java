package day08_0210.lombokEx;

import lombok.*;
import org.w3c.dom.NameList;

@Data // 기본생성자 getter setter hashcode(),equals,toString
//@Setter
//@Getter
@NoArgsConstructor // 매개변수없는 기본생성자
@AllArgsConstructor // 모든 필드를 초기화시키는 생성자
//@RequiredArgsConstructor // 기본적으로 매개변수 없는 생성자 만약 final ,@Notnull이 붙은 필드가 있다면 이 필드만 초기화
//@EqualsAndHashCode
//@ToString
//final @NotNull 차이점은 초기화된 final 필드는 변경할 수 없다.(setter메소드를 만들어 지지 않음)
//@NonNull null이
public class Member {
    private String id;
    @NonNull private String name;
    private int age;

    Member(){}
    Member(String id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
