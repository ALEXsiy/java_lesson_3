import java.util.*;
//Компаратор для сравнения по имени
class NameComparator implements Comparator<User> {
    //Переопределим метод
    @Override
    public int compare(User u_1, User u_2) {
        //Сравниваем строки без учёта регистра
        if (u_1.getName().compareToIgnoreCase(u_2.getName())==0)
            return 0;
        else if (u_1.getName().compareToIgnoreCase(u_2.getName())>0)
            return 1;
        else
            return -1;
    }
}
