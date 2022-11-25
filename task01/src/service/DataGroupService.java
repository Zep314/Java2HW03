// Интерфейс для работы со студенческой группой
package service;
import data.StudentsGroup;

public interface DataGroupService {
    void create(StudentsGroup studentsGroup);
    StudentsGroup read(String fileName);
}
