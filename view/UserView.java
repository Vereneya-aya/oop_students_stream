import java.util.List;

public interface UserView<T extends User> {
    
     void sendOnConsole(List<T> list);

    // Logger logger = Logger.getLogger(UserView.class.getName());

    // void sendOnConsole(List<User> userList){
    //     for(User user: userList){
    //         logger.info(user.toString());
    //     }
    // }

    // void sendOnConsoleUserGroup(StudentGroup studentGroup){
    //     logger.info(studentGroup.toString());
    // }

    // void sendOnConsoleListStudent(List<Student> students){
    //     logger.info(students.toString());
    // }

}