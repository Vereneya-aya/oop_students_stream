import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private final List<StudentGroup> studentGroups;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
        }

    @Override
    public String toString() {
        return "Stream{\n" +
               "studentGroups=" + studentGroups +
               '}';
    }

    public void sort(StreamComparator c) {
        studentGroups.sort(c);
    }



}
