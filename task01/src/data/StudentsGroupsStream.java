package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroupsStream implements Iterator<StudentsGroup> {
    // Класс - поток для студенческих групп - тренируесмя работать с итераторами
    private int index;  // Указатель на текущую запись
    protected List<StudentsGroup> studentsGroups = new ArrayList<StudentsGroup>();

    public StudentsGroupsStream(List<StudentsGroup> groupList) {
        this.index = 0;
        this.studentsGroups.addAll(groupList);
    }

    public StudentsGroupsStream() {
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
    public boolean hasNext() {  // Обработка метода итератора
        return this.index < this.studentsGroups.size();
    }

    @Override
    public StudentsGroup next() { // Обработка метода итератора
        return this.studentsGroups.get(this.index++);
    }

}