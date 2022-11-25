// Класс Student
package data;

public class Student extends User {
    private String studentId;

    public Student(String studentId,String name, String birthday) {
        super.setName(name);
        super.setBirthday(birthday);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {  // "Пережиток" от родительского класса. Его надо реализовать обязательно!
        return  "Тип: Студент Имя: " + super.getName() +
                " День рождения: " + super.getBirthday() +
                " Идентификатор: " + studentId;
    }
}
