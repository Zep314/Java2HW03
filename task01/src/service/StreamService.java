package service;

import data.StudentsGroup;
import data.StudentsGroupsStream;
import data.StreamComparator;

import java.util.List;
// Класс для расширения функционала потока групп студентов
public class StreamService extends StudentsGroupsStream{
    public StreamService(){
        super();
    }
    public StreamService(List<StudentsGroup> groupList){
        super(groupList);
    }
    public void mySort() {  // сортировка членов группы студентов
        this.studentsGroups.sort(new StreamComparator());
    }
}