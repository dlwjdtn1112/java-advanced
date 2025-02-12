package Project;

import java.util.List;

public interface StudentIO {
    void saveStudentData(List<StudentDTO> students);
    void loadStudentData(List<StudentDTO> students);

}
