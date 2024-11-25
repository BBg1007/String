public class Main {
    public static void main(String[] args) {


        //Task1

        System.out.println("Задача 1");
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+middleName+" "+firstName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
        System.out.println();

        //Task2

        System.out.println("Задача 2");
        System.out.println();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
        System.out.println();

        //Task3

        System.out.println("Задача 3");
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName);


    }
}