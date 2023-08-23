import java.util.*;
public class Test_2 {
    public static void main(String[] args) {
        //3.5 Задание 7. Работа со списками объектов
        //Создаем экземпляр класса
        ArrayList<User> user_list = new ArrayList<User>();
        Scanner in = new Scanner(System.in);
        //Считываем и заполняем данные
        for (int i = 0; i < 5; i++) {
            System.out.printf("Введите имя %d-го пользователя: ", i + 1);
            String name = in.nextLine();
            System.out.printf("Введите возраст %d-го пользователя: ", i + 1);
            Integer age = in.nextInt();
            in.nextLine();
            User user = new User(name, age);
            user_list.add(user);
        }
        in.close();
        //Сортируем данные, с помощью сортировки по коллекции с использованием компоратора AgeComparator
        Collections.sort(user_list, new AgeComparator());
        //Выводим данные
        System.out.println("\nСписок пользователей: ");
        for (User user : user_list) {
            System.out.println(user.toString());
        }
    }
}
