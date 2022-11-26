package service;

import data.StudentsGroup;
import data.StreamComparator;
import data.StudentsGroupsStream;

import java.util.Collections;
import java.util.List;

public class StreamService extends StudentsGroupsStream{
    StreamService(){
        super();
    }
    StreamService(List<StudentsGroup> groupList){
        super(groupList);
    }

    public void sort(boolean acs) {
        //Collections.sort(this.studentsGroups);

    }
}