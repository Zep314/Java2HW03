package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupsStream implements Iterator<StudentsGroup> {
    private int index;
    protected List<StudentsGroup> studentsGroups = new ArrayList<StudentsGroup>();

    public StudentsGroupsStream(List<StudentsGroup> groupList) {
        this.studentsGroups.clear();
        this.index = 0;
        this.studentsGroups.addAll(groupList);
    }

    public StudentsGroupsStream() {
        this.studentsGroups.clear();
        this.index = 0;
    }

    public void AddStudentsGroup(StudentsGroup studentsGroup) {
        this.studentsGroups.add(new StudentsGroup(studentsGroup));
    }

    public void AddAll(List<StudentsGroup> studentsGroupList) {
        this.studentsGroups.addAll(studentsGroupList);
    }

    public void ResetIndex() { this.index = 0;}

    public int size() { return this.studentsGroups.size(); }

    @Override
    public boolean hasNext() {
        return (this.index < this.studentsGroups.size()) ? true : false;
    }

    @Override
    public StudentsGroup next() {
        return this.studentsGroups.get(this.index++);
    }
}