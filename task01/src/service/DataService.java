// Интерфейс для работы с одним членом студенческой группы
package service;
import data.User;

public interface DataService {
    void create(User user);
    User read(String fileName);
}
