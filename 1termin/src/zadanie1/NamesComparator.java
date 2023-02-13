package zadanie1;

import java.util.Comparator;

public class NamesComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
