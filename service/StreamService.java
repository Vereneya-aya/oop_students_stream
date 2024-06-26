import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;

    public void createStream(List<StudentGroup> students) {
        this.stream = new Stream(students);
    }

    public List<StudentGroup> getStream() {
        return stream.getStudentGroups();
    }

    
   
    public List<StudentGroup> getSortedStreamGroups(List<StudentGroup> stream) {
        List<StudentGroup> groups = new ArrayList<>((List<StudentGroup>) stream);
        groups.sort(new StreamComparator());
        return groups;
    }}
