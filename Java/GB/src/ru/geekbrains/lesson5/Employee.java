package ru.geekbrains.lesson5;

public class Employee {


    private String fio;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;
    private static final int MAX_AGE = 40;

    public Employee(String fio, String position, String email, String tel, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public static int getMaxAge() {
        return MAX_AGE;
    }

    public void info() {
            System.out.println("fio: " + this.getFio() + "; Должность: " + this.getPosition() + "; Почта: " +
            this.getEmail() + "; Телефон: " + this.getTel() + "; Зарплата: " + this.getSalary());
    }








}


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//2. Конструктор класса должен заполнять эти поля при создании объекта;
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//4. Создать массив из 5 сотрудников
 //Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
 //...
//persArray[4] = new Person(...);
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

