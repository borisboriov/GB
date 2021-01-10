package ru.geekbrains.lesson5;

public class Employee {


    private String fio;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;


    public Employee(String fio, String position, String email, String tel, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
            System.out.println("fio: " + fio + "; Должность: " + position+ "; Почта: " +
            email + "; Телефон: " + tel + "; Зарплата: " + salary);
    }


    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "SEO", "ivanov@class.com", "94756", 100000, 42);
        persArray[1] = new Employee("Petrov Petr Petrovich", "Account", "petrov@class.com", "34432", 50000, 30);
        persArray[2] = new Employee("Hudo Gavrila Sanich ", "Finance", "hudo@class.com", "43333", 90000, 45);
        persArray[3] = new Employee("Puzo Ostap Gavrilich ", "Group head", "puzo@class.com", "44444", 45000, 29);
        persArray[4] = new Employee("Kapusta Lev Durindich", "engineer", "kapusta@class.com", "12312", 47000, 28);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40){
                System.out.println(persArray[i].fio + " Сотрудник старше 40 лет" );

            }
        }

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

