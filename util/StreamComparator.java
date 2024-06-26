import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup>{

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudentGroupSize()-o2.getStudentGroupSize();
    }
}