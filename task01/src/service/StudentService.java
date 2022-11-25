// Класс для работы с членом студенческой группы
package service;

import data.Student;
import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public class StudentService implements DataService {
    // Записываем в файл
    @Override
    public void create(User user) {
        if (user instanceof Student){
            WriterToTxt.writeUser(user);
        }
        else System.out.println("Ошибка!");
    }

    // читаем из файла
    @Override
    public User read(String fileName) {
        return ReaderFromTxt.readUser(fileName);
    }
}
