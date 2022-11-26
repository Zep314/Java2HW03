package data;

import java.util.List;

public class StreamComparator {
    StudentsGroup studentGroup = new StudentsGroup();

    public StreamComparator(StudentsGroup group) {
        this.studentGroup = group;
    }
    public boolean CompareLarger(StudentsGroup anotherGroup, boolean asc) {
        return (asc) ? this.studentGroup.getSizeOfGroup() > this.studentGroup.getSizeOfGroup() :
                this.studentGroup.getSizeOfGroup() < this.studentGroup.getSizeOfGroup();
    }
}