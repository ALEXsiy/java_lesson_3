import java.util.*;
public class Test_1 {
    public static void main(String[] args) {
        //3.4 Задание 6. Работа с классами и объектами
    Scanner in = new Scanner(System.in);
    //Считываем данные
    System.out.print("Введите имя 1-го человека: ");
    String name_1 = in.nextLine();
    System.out.print("\nВведите возраст 1-го человека: ");
    Integer age_1 = in.nextInt();
    in.nextLine();
    System.out.print("\nВведите имя 2-го человека: ");
    String name_2 = in.nextLine();
    System.out.print("\nВведите возраст 2-го человека: ");
    Integer age_2 = in.nextInt();
    System.out.println();
    in.close();
    //Создаем экземпляры класса
    User us_1 =new User(name_1,age_1);
    User us_2 =new User(name_2,age_2);
    //Производим сравнение и выводим данные
    if(us_1.getAge()>us_2.getAge()){
        System.out.println(us_2.toString());
    }
    else if(us_1.getAge()==us_2.getAge()){
        System.out.println("Возрасты равны.");
        System.out.println(us_1.toString());
        System.out.println(us_2.toString());
    }
    else{
        System.out.println(us_1.toString());
    }
    }
}



