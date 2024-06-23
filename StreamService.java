import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;
   
    public List<StudentGroup> getSortedStreamGroups(Stream stream) {
        List<StudentGroup> groups = new ArrayList<>(stream.getStudentGroups());
        groups.sort(new StreamComparator());
        return groups;
    }}
