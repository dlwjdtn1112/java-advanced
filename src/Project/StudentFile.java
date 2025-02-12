package Project;

import java.util.List;

public class StudentFile implements StudentIO{
    @Override
    public void saveStudentData(List<StudentDTO> students) {
        System.out.println("학생 데이터를 저장했습니다.");

    }

    @Override
    public void loadStudentData(List<StudentDTO> students) {
        System.out.println("학생 데이터를 불러 왔다..");

    }
}
