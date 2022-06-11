public class Main {
    public static void main(String[] args) {
        // Задача 1
        //Напишите четыре строки:
        //первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        //третья с именем lastName — для хранения фамилии;
        //четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задача 2
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника
        // с  “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);

        //Задача 3
        //Нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”

        String [] fullName1 = fullName.split (" ");
        for (int i = 0; i <= fullName1.length-1; i++) {
            if (fullName1[i].contains("ё")) {
                fullName1[i] = fullName1[i].replace("ё", "е");
            }
        }
            String fullNameReplace = fullName1[0] + " " + fullName1[1] + " " + fullName1[2];
            System.out.println();
            System.out.print("Данные ФИО сотрудника —  " + fullNameReplace);


    }
}