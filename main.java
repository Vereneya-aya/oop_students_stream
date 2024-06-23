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


    StreamService streamService = new StreamService();
    stream1.sort(c);
    //System.out.println(stream1);

    //streamService.getSortedStreamGroups(stream1);
    System.out.println(streamService.getSortedStreamGroups(stream1));




    

}
    
}