import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final DataService dataService = new DataService();
    private final TeacherService teacherService = new TeacherService(new ArrayList<Teacher>());
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public Teacher getTeacher(String name, String surname) {
        return teacherService.getTeacher(name, surname);
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }

    

   
    // public void getStudentInStudentGroup(String firstName, String secondName){
    //     Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    //     studentView.sendOnConsole(Collections.singletonList(student));
    // }

    
}
