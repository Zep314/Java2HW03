// Вспомогательный класс - чтение из файла
package util;

import data.Student;
import data.StudentsGroup;
import data.Teacher;
import data.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ReaderFromTxt {
    public static User readUser(String fileName){  // Чтение из файла одного члена студенческой группы
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            ArrayList<String> arrayList = new ArrayList<>();  // Тут будет все прочитанное из файла
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                arrayList.add(line);
            }
            if(arrayList.get(0).contains("Teacher")){  // Возвращаем объект учителя
                return new Teacher(arrayList.get(3),arrayList.get(1),arrayList.get(2));
            }
            if (arrayList.get(0).contains("Student")){  // Возвращаем объект студента
                return new Student(arrayList.get(3),arrayList.get(1),arrayList.get(2));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static StudentsGroup readGroup(String fileName) {  // Чтение из файла целиком всей группы
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            ArrayList<String> arrayList = new ArrayList<>();  // Тут будет все прочитанное из файла
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                arrayList.add(line);
            }
            StudentsGroup group = new StudentsGroup();  // Тут все будем формировать для возвращения
            String kind = "";
            String name = "";
            String birthday = "";
            String property = "";
            for(int i = 0; i < arrayList.size(); i++) {
                switch (i % 4) {
                    case 0 -> kind = arrayList.get(i);  // на каждую запись отводится 4 чтроки в файле
                    case 1 -> name = arrayList.get(i);
                    case 2 -> birthday = arrayList.get(i);
                    case 3 -> property = arrayList.get(i);
                }
                if ((i+1) % 4 == 0) {  // О! прочитали 4 строки из файла - надо все добавить в список группы
                    if (kind.equals("Teacher")) {
                        group.SetTeacher(new Teacher(property, name, birthday));
                    }
                    else {
                        group.AddStudent(new Student(property, name, birthday));
                    }
                }
            }
            return group;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
