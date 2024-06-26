import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

public static void main(String[] args) {
    Student s1 = new Student("Ivan", "Ivanov","Ivanovich", LocalDate.of(1990,05,22));
    s1.setStudentId(1L);
    //System.out.println(s1);
    Student s2 = new Student("Abra", "Sova","Krivovich", LocalDate.of(1994,05,22));
    s2.setStudentId(2L);
    //System.out.println(s2);
    Student s3 = new Student("Fedr", "Fedrov","Fedorovich", LocalDate.of(1980,07,29));
    s3.setStudentId(3L);
    //System.out.println(s3);

    //System.out.println(s1.compareTo(s3));

    StudentGroup sg1 = new StudentGroup(new Teacher("Karl", "Karlov", "Karlovich", LocalDate.of(1970,05,05)), new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
    //System.out.println(sg1);

    // StudentGroupIterator si1 = new StudentGroupIterator(sg1);
    // while (si1.hasNext()){
    //     Student student = si1.next();
    //     System.out.println(student);
    // }

    Student s4 = new Student("Mar", "Maroves", "Marovich", LocalDate.of(1999, 04, 05));
    s4.setStudentId(4L);

    Student s5 = new Student("Jor", "Joroves", "Jorovich", LocalDate.of(1999, 8, 05));
    s5.setStudentId(5L);

    Student s6 = new Student("Par", "Paroves", "Parovich", LocalDate.of(1999, 04, 05));
    s6.setStudentId(6L);

    StudentGroup sg2 = new StudentGroup(new Teacher("Barl", "Barlov", "Barlovich", LocalDate.of(1970,05,05)), new ArrayList<Student>(Arrays.asList(s4, s5)));
    StudentGroup sg3 = new StudentGroup(new Teacher("Zarl", "Zarlov", "Zarlovich", LocalDate.of(1970,05,05)), new ArrayList<Student>(Arrays.asList(s6)));

    // StudentGroupIterator si2 = new StudentGroupIterator(sg2);
    // while (si2.hasNext()){
    //     Student student = si2.next();
    //     System.out.println(student);
    // }

    Stream stream1 = new Stream (new ArrayList<StudentGroup>(Arrays.asList(sg1,sg2,sg3)));
    //System.out.println(stream1);
    //StreamIterator si3 = new StreamIterator(stream1);
    // while (si3.hasNext()){
    //     StudentGroup studentGroup = si3.next();
    //     System.out.println(studentGroup);
    //     }
    // }

    StreamComparator c = new StreamComparator();
    //System.out.println(c.compare(sg1,  sg2));


    //StreamService streamService = new StreamService();
    stream1.sort(c);
    //System.out.println(stream1);

    //streamService.getSortedStreamGroups(stream1);
    //System.out.println(streamService.getSortedStreamGroups(stream1.getStudentGroups()));

    TeacherService ts = new TeacherService(new ArrayList<Teacher>());
    ts.create("Yakov", "Nikolai", "Yakovich", LocalDate.of(1980, 5, 21));
    ts.getTeacher("Yakov", "Nikolai").setTeacherId(1L);
    ts.create("Ivan", "Ivanov", "Ivanovich", LocalDate.of(1990, 5, 22));
    ts.getTeacher("Ivan", "Ivanov").setTeacherId(2L);
    ts.create("Jakov", "Nikolai", "Yakovich", LocalDate.of(1981, 5, 21));
    ts.getTeacher("Jakov", "Nikolai").setTeacherId(3L);

    List<Teacher> teacherList = new ArrayList<Teacher>();
    teacherList.add(ts.getTeacher("Yakov", "Nikolai"));
    teacherList.add(ts.getTeacher("Ivan", "Ivanov"));
    teacherList.add(ts.getTeacher("Jakov", "Nikolai"));

    TeacherService ts1 = new TeacherService(teacherList);
    System.out.println(ts1.getAll());
    System.out.println("--------------------------------");


   // System.out.println(teacherList);

    //TeacherController tc = new TeacherController();
   //System.out.println(tc.getAllTeachers());
   ts1.editTeacher(ts1.getTeacher("Yakov", "Nikolai"), "Makov", "Mikalai", "Mikalaevich", LocalDate.of(1944,4,4));
   System.out.println(ts1.getAll());



    

}
    
}