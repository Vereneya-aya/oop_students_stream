import java.time.LocalDate;
// import java.util.List;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    // private final DataService dataService = new DataService();
    // private final StudentGroupService studentGroupService = new StudentGroupService();
    // private final UserView userView = new UserView();
    // private final StreamService streamService = new StreamService();

    // public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
    //     dataService.create(firstName, secondName, patronymic, dateOfBirth);
    //     List<User> userList = dataService.getAll();
    //     userView.sendOnConsole(userList);
    // }

    // public void createStudentGroup(Teacher teacher, List<Student> students){
    //     studentGroupService.createStudentGroup(teacher, students);
    // }

    // public Student getStudentInStudentGroup(String firstName, String secondName){
    //     return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    // }

    // public List<Student> getSortedListStudentFromStudentGroup(){
    //     return studentGroupService.getSortedStudentGroup();
    // }

    // public List<Student> getSortedListByFIOStudentFromStudentGroup(){
    //     return studentGroupService.getSortedByFIOStudentGroup();
    // }

    // public List<StudentGroup> getSortedListStudentGroup(){
    //     return streamService.getSortedStreamGroups(streamService.getStream());
    // }
}
