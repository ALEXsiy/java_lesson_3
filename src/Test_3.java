import java.util.*;
public class Test_3 {
    public static void main(String[] args) {
        //Задание 8. Работа с ассоциативными массивами
        //Создаем хэшмап
        HashMap<Integer,List<User>> us_m = new HashMap<Integer,List<User>>();
        Scanner in = new Scanner(System.in);
        //Считываем и записыываем данные
        for(int i=0;i<5;i++){
            System.out.printf("Введите имя %d-го пользователя: ",i+1);
            String name=in.nextLine();
            System.out.printf("Введите возраст %d-го пользователя: ",i+1);
            Integer age = in.nextInt();
            in.nextLine();
            User user=new User(name,age);
            if(us_m.containsKey(age)){
                //есть ключ, то добавляем в лист
                us_m.get(age).add(user);
            }
            else{
                //нет ключа, то создаем лист и добавляем туда элемент
                List<User> ex_us = new ArrayList<User>();
                ex_us.add(user);
                us_m.put( age,ex_us) ;
            }

        }
        //Считаем возраст для поиска
        System.out.println("Введите возраст: ");
        Integer age_f = in.nextInt();
        in.close();
        //Ищем возраст- нет или есть
        if(!us_m.containsKey(age_f)){
            System.out.println("Такого возраста в мапе нет!");
        }
        else{
            //Сортируем  и выводим
            Collections.sort(us_m.get(age_f), new NameComparator());
            System.out.println("\nСписок пользователей в списке: ");
            for (User user : us_m.get(age_f)) {
                System.out.println(user.toString());
            }
        }





    }
}