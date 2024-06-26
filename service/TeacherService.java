import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService(List<Teacher> list1) {
        this.teachers = new ArrayList<>(list1);
    }

public Teacher getTeacher(String name, String surname) {
    for (Teacher teacher : teachers) {
        if ((teacher.getFirstName().equals(name)) && (teacher.getSecondName().equals(surname))) {
            return teacher;
        }
    }
    return new Teacher(name, surname, null, null);
}
public void editTeacher(Teacher teacherToEdit, String newName, String newSurname, String newPatronymic, LocalDate newDateOfBirth){
    for (Teacher teacher : teachers) {
        if ((teacher.getFirstName().equals(teacherToEdit.getFirstName())) && (teacher.getSecondName().equals(teacherToEdit.getSecondName()))) {
            teacher.setFirstName(newName);
            teacher.setSecondName(newSurname);
            teacher.setPatronymic(newPatronymic);
            teacher.setDateOfBirth(newDateOfBirth);
            return;
        }
    }
}
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher (firstName, secondName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }
    
    
}
