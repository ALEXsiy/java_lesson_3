class User {
    //Прописываем поля класса с модификатором доступа private
    private String name;
    private Integer age;
    //Конструктор без параметров
    User(){
        this.age = 0;
        this.name ="НЕОПРЕДЕЛЕННО";
    }
    //Конструктор с параметрами
    User(String name,Integer age){
        this.name=name;
        this.age=age;
    }
    //Геттеры
    public  String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    //Сеттеры
    public void setName(String name){
        this.name=name;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    //Метод для получения строки
    public String toString(){
        String result = this.name+", возраст "+Integer.toString(age)+" лет!";

        return result;
    }

}
