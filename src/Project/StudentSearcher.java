package Project;

import java.util.List;

public class StudentSearcher implements SearchStudent{
    private List<StudentDTO> students;

    public StudentSearcher(List<StudentDTO> students) {
        this.students = students;
    }

    @Override
    public StudentDTO search(String sno) {
        for (StudentDTO student : students) {
            if (student.sno.equals(sno)) {
                return student;
            }
        }
        return null;
    }

}
