import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //Строки. Задание 1
    public static void StringBuild() {
        StringBuilder strB = new StringBuilder();
        int firstNumber = 21;
        int secondNumber = 12;
        strB.append(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        strB.append("\n");
        strB.append(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        strB.append("\n");
        strB.append(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        strB.append("\n");

        System.out.println(strB.toString());

        while (strB.indexOf("=") != -1) {
            int index = strB.indexOf("=");
            strB.replace(index, index + 1, "равно");
        }

        System.out.println(strB.toString());
    }

    //Строки. Задание 2
    public static void RegularPattern1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст, содержащий ссылку:");
        String text = scanner.nextLine();

        Pattern regex = Pattern.compile("\\S+\\.com(\\s|\\z)");
        Matcher matcher = regex.matcher(text);

        boolean isFind = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            isFind = true;
        }

        if (!isFind) {
            System.out.println("В тексте отсутствует ссылка");
        }
    }

    //Строки. Задание 3
    public static void RegularPattern2() {
        String text = "ahb acb aeb aeeb adcb axeb";
        System.out.printf("Начальная строка:\n" + text + "\n");

        Pattern regex = Pattern.compile("\\b(a.b)\\b");
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Строки. Задание 4
    public static void RegularPattern3() {
        String text = "ab abab abab abababab abea";
        System.out.printf("Начальная строка:\n" + text + "\n");

        Pattern regex = Pattern.compile("\\b(ab)+\\b");
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //Строки. Задание 5
    public static void RegularPattern4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату (пример - '2012/09/18 12:10')");
        String text = scanner.nextLine();

        Pattern regex = Pattern.compile("((1\\d\\d\\d)|(200\\d)|(201[0-2]))/((0[1-9])|(1[0-2]))/((0[1-9])|([12]\\d)|(30)) (([01]\\d)|(2[0-3])):([0-5]\\d)");
        Matcher matcher = regex.matcher(text);

        if (matcher.find()) {
            System.out.println("Дата " + text + " - существует");
        } else {
            System.out.println("Дата " + text + " - не существует");
        }
    }

    //Исключения
    public static void CatchException() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ФИО:");
            String fio = scanner.nextLine();
            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age < 0 || age > 100) {
                throw new IncorrectInfoException("Введены некорректные данные!", fio, age);
            }

            Pattern regex = Pattern.compile("\\p{Punct}");
            Matcher matcher = regex.matcher(fio);
            if (fio.length() > 200 || matcher.find()) {
                throw new IncorrectInfoException("Введены некорректные данные!", fio, age);
            }
        }
        catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StringBuild(); //Строки. Задание 1
        RegularPattern1(); //Строки. Задание 2
        RegularPattern2(); //Строки. Задание 3
        RegularPattern3(); //Строки. Задание 4
        RegularPattern4(); //Строки. Задание 5
        CatchException(); //Исключения
    }
}