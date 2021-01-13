package ru.geekbrains.lesson5;

public class EmployeeInfo {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "SEO", "ivanov@class.com", "94756", 100000, 42);
        persArray[1] = new Employee("Petrov Petr Petrovich", "Account", "petrov@class.com", "34432", 50000, 30);
        persArray[2] = new Employee("Zizek Gavrila Sanich ", "Finance", "zizek@class.com", "43333", 90000, 45);
        persArray[3] = new Employee("Puzo Ostap Gavrilich ", "Group head", "puzo@class.com", "44444", 45000, 29);
        persArray[4] = new Employee("Kapusta Lev Durindich", "engineer", "kapusta@class.com", "12312", 47000, 28);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                System.out.println(persArray[i].getFio() + " Сотрудник старше 40 лет" );
                persArray[i].info();
            }
        }

    }


}
