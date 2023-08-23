import java.util.*;
//Компаратор для сравнения по возрасту
class AgeComparator implements Comparator<User> {

     @Override //Переопределили метод
    public int compare(User u_1, User u_2) {
         //Сравниваем возраст
        if (u_1.getAge() == u_2.getAge())
            return 0;
        else if (u_1.getAge() > u_2.getAge())
            return 1;
        else
            return -1;
    }
}

