// Класс Студенческая группа
package data;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup{
    // Тут список членов группы. Среди них может быть учитель
    private List<User> groupMembers = new ArrayList<User>();

    public StudentsGroup() {
        this.groupMembers.clear();
    } // Если создали пустую группу

    public StudentsGroup(List<User> groupList) {
        SetMembers(groupList);
    }  // Если создали сразу с членами
                                                                           // группы

    public void SetTeacher(Teacher teacher) {  // Установка учителя в группе
        for(User u: this.groupMembers) {  // Если уже есть учитель - то его удаляем из списка
            if (u.getClass().getSimpleName().equals("Teacher")) {  // Так отличаем учителя от студента
                this.groupMembers.remove(u);
                break;
            }
        }
        this.groupMembers.add(teacher);  // Добавляем в список нового учителя
    }

    public void AddStudent(Student student) {  // Добавление всего одного студента
        this.groupMembers.add(student);
    }
    public void SetMembers(List<User> studentsList) {  // Занового устанавливаем список членов группы
        this.groupMembers.clear();
        this.groupMembers.addAll(studentsList);
    }

    public Teacher getTeacher() {  // Выдаем, кто у нас учитель
        User teacher = null;
        for(User u: this.groupMembers) {
            if (u.getClass().getSimpleName().equals("Teacher")) {  // Так отличаем учителя от студента
                teacher = u;
                break;
            }
        }
        return (Teacher)teacher;
    }

    public List<Student> getStudents(){  // Выдаем всех студентов
        List<Student> students = new ArrayList<Student>();
        for(User u: this.groupMembers) {
            if (!u.getClass().getSimpleName().equals("Teacher")) {  // Так отличаем учителя от студента
                students.add((Student)u);
            }
        }
        return students;
    }

    public List<User> getMembers() {
        return this.groupMembers;
    }  // Выдаем вообще всех

}