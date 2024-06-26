import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxStId = 0L;
        Long countMaxTId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxStId){
                    countMaxStId = ((Student) user).getStudentId();
                }
            countMaxStId++;
            Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxStId);
            this.users.add(student);
            }
            else if(user instanceof Teacher){
                if (((Teacher) user).getTeacherId() > countMaxTId){
                    countMaxTId = ((Teacher) user).getTeacherId();
                }
                countMaxTId++;
                Teacher teacher = new Teacher(firstName, secondName,patronymic, dateOfBirth);
                this.users.add(teacher);
            }
        }
       

        
    }
}