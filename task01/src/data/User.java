// Абстрактный класс-скелет для пользователей всех мастей
package data;

public abstract class User {
        private String name;
        private String birthday;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }
}
