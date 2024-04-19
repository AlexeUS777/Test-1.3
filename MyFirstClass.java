import java.util.Scanner;

public class MyFirstClass {
    public static void main(String [] args){

        //1.Пользователь вводит строку, выведите ее длину.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String str = scanner.nextLine();
        int x = str.length();
        System.out.println("Длина строки равна " + x);

        //2.Пользователь вводит две строки, выведите сумму их длин.
        System.out.print("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку:");
        String str2 = scanner.nextLine();
        int y = str1.length() + str2.length();
        System.out.println("Сумма длин двух строк равна " + y);

        //3.Пользователь вводит три строки. Найти, какая из них короче всех.
        System.out.print("Введите первую строку:");
        String str3 = scanner.nextLine();
        System.out.print("Введите вторую строку:");
        String str4 = scanner.nextLine();
        System.out.print("Введите третью строку:");
        String str5 = scanner.nextLine();
        int z3 = str3.length();
        int z4 = str4.length();
        int z5 = str5.length();
        if((z3 < z4) && (z3 < z5)){
            System.out.println("Первая строка короче всех");
        } else if((z4 < z3) && (z4 < z5)){
            System.out.println("Вторая строка короче всех");
        } else{
            System.out.println("Третья строка короче всех");
        }

        //4.Пользователь вводит три дробных числа. Вывести те из них, квадратный корень которых меньше2.
        System.out.print("Введите первое число:");
        double q = scanner.nextInt();
        System.out.print("Введите второе число:");
        double q1 = scanner.nextInt();
        System.out.print("Введите третье число:");
        double q2 = scanner.nextInt();
        if(Math.sqrt(q) < 2){
            System.out.println(q);
        }
        if(Math.sqrt(q1) < 2){
            System.out.println(q1);
        }
        if(Math.sqrt(q2) < 2){
            System.out.println(q2);
        }

        //5.Пройдите в дебаге программу:int x = 1;while (x>=-3) {System.out.print(x);x = x -1;}
        // Сколько раз выводится икс?
        int x12 = 1;
        while (x12 >= -3){
            System.out.print(x);
            x12 = x12 - 1;
        }
        //x выводится 6 раз, так как последняя проверка на то что условие false тоже происходит в оперативной
        //памяти компьютера.

        //6.Пройдите в дебаге программу:
        // String str = “Hell”;while (str.length()<10) {str = str + “o”;}
        // Сколько раз вызывается метод str.length()?
        String str55 = "Hell";
        while(str55.length() < 10){
            str55 = str55 + "o";
        }
        //метод str.length() вызывается 7 раз, аналогично предыдущему заданию, такое же объяснение и на это.

        //7.Пользователь вводит два числа. Разделить меньшее на большее и вывести результат.
        System.out.print("Введите первое число:");
        double r1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        double r2 = scanner.nextInt();
        if(r1 < r2){
            System.out.println(r1 / r2);
        } else if(r1 > r2){
            System.out.println(r2 / r1);
        }

        //8.Пользователь вводит строку. Используя substring, вывести первые 5 символов.
        System.out.print("Введите строку:");
        String str11 = scanner.nextLine();
        System.out.println(str11.substring(0, 5));

        //9.Считайте boolean-переменную.
        //Если пользователь ввел true, вывести “истина”, иначе ничего не стоит выводить.

        System.out.print("Введите true or false:");
        boolean j = scanner.nextBoolean();
        if(j){
            System.out.println("Истина");
        } else{
            System.out.println();
        }

        //10.Пользователь вводит 3 числа.
        // Сделайте три boolean переменных: есть ли среди введённых четное,
        // есть ли среди введённых отрицательное, есть ли число больше тысячи
        System.out.print("Введите первое число:");
        double l1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        double l2 = scanner.nextInt();
        System.out.print("Введите третье число:");
        double l3 = scanner.nextInt();
        boolean even = ((l1 % 2 == 0) || (l2 % 2 == 0) || (l3 % 2 == 0));
        boolean minus = ((l1 < 0) || (l2 < 0) || (l3 < 0));
        boolean big = ((l1 > 1000) || (l2 > 1000) || (l3 > 1000));
        if(even){
            System.out.println("Есть чётное(ые) число(а)");
        }
        if(minus){
            System.out.println("Есть отрицательное(ые) число(а)");
        }
        if(big){
            System.out.println("Есть число(а) больше 1000");
        }

        //11.Пользователь вводит три строки, используя .substring(0, x)
        //выведите эти строки, обрезав те, что длиннее самой короткой.
        //Пример ввода: «повар», «поделка», «лампочка». Вывод: «повар», «подел», «лампо»
        System.out.print("Введите первую строку:");
        String str22 = scanner.nextLine();
        System.out.print("Введите вторую строку:");
        String str23 = scanner.nextLine();
        System.out.print("Введите третью строку:");
        String str24 = scanner.nextLine();
        int ss22 = str22.length();
        int ss23 = str23.length();
        int ss24 = str24.length();
        if((ss22 < ss23) && (ss22 < ss24)){
            System.out.println(str22 + " " + str23.substring(0, ss22) + " " + str24.substring(0, ss22));
        } else if((ss23 < ss22) && (ss23 < ss24)){
            System.out.println(str22.substring(0, ss23) + " " + str23 + " " + str24.substring(0, ss23));
        } else if((ss24 < ss22) && (ss24 < ss23)){
            System.out.println(str22.substring(0, ss24) + " " + str23.substring(0, ss24) + " " + str24);
        }

        //12.Мини-игра в слова. Первый игрок вводит слово.
        //Потом второй игрок вводит два числа, с какого по какой символ можно найти слово внутри исходного,
        //используя substring. Потом первый игрок вводит два числа.
        //Побеждает тот, чье слово длиннее.
        //Пример:1: революционный2: 0 3 (вывод: рев)1: 7 13 (вывод: ионный)Победил игрок 1
        System.out.print("1 Игрок. Введите слово:");
        String str111 = scanner.nextLine();
        System.out.print("2 Игрок. Введите первое число:");
        int s111 = scanner.nextInt();
        System.out.print("2 Игрок. Введите второе число:");
        int s222 = scanner.nextInt();
        System.out.print("1 Игрок. Введите первое число:");
        int s221 = scanner.nextInt();
        System.out.print("1 Игрок. Введите второе число:");
        int s211 = scanner.nextInt();
        String str121 = str111.substring(s111, s222); //2 player
        String str212 = str111.substring(s221, s211); //1 player
        int ss11 = str121.length();
        int ss44 = str212.length();
        if(ss11 > ss44){
            System.out.println(str121 + " 2 Игрок победил!");
        } else{
            System.out.println(str212 + " 1 Игрок победил!");
        }


    }

}
