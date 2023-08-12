public class Main {
    public static void main(String[] args) {
        //Операторы. Обязательное задание 1
        {
            int n = 25;
            System.out.print("n = " + n + ". ");
            if (n % 2 == 0) {
                System.out.println("n - четное число");
            } else {
                System.out.println("n - нечетное число");
            }
        }
        //Операторы. Обязательное задание 2
        {
            //if-else
            {
                int day = 5;
                System.out.print("Введен день " + day + ". ");
                if (day == 1) {
                    System.out.println("понедельник");
                } else if (day == 2) {
                    System.out.println("вторник");
                } else if (day == 3) {
                    System.out.println("среда");
                } else if (day == 4) {
                    System.out.println("четверг");
                } else if (day == 5) {
                    System.out.println("пятница");
                } else if (day == 6) {
                    System.out.println("суббота");
                } else if (day == 7) {
                    System.out.println("воскресенье");
                } else {
                    System.out.println("Дня " + day + " не существует");
                }
            }
            //switch
            {
                int day = 2;
                System.out.print("Введен день " + day + ". ");
                switch (day) {
                    case 1:
                        System.out.println("понедельник");
                        break;
                    case 2:
                        System.out.println("вторник");
                        break;
                    case 3:
                        System.out.println("среда");
                        break;
                    case 4:
                        System.out.println("четверг");
                        break;
                    case 5:
                        System.out.println("пятница");
                        break;
                    case 6:
                        System.out.println("суббота");
                        break;
                    case 7:
                        System.out.println("воскресенье");
                        break;
                    default:
                        System.out.println("Дня " + day + " не существует");
                }
            }
        }
        //Операторы. Обязательное задание 3
        {
            int a = 8;
            int b = 2;
            int c = 5;
            System.out.print("a = " + a + ", b = " + b + ", c = " + c + ". ");
            if ((a >= b && b >= c) || (a <= b && a >= c)) {
                System.out.println(a + b);
            } else if (a >= b && b <= c) {
                System.out.println("Сумма наибольших чисел равна " + (a + c));
            } else {
                System.out.println("Сумма наибольших чисел равна " + (b + c));
            }
        }
        //Операторы. Обязательное задание 4
        {
            int year = 2023;
            if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) {
                System.out.println("В " + year + " году " + 366 + " дней");
            } else {
                System.out.println("В " + year + " году " + 365 + " дней");
            }
        }
        //Операторы. Дополнительное задание 5
        {
            int N = 4;
            double A = 6.5;
            double B = 2.1;
            System.out.print("N = " + N + ", A = " + A + ", B = " + B + ". ");
            switch (N) {
                case 1:
                    System.out.println("Сумма A и B равна " + (A + B));
                    break;
                case 2:
                    System.out.println("Разность A и B равна " + (A - B));
                    break;
                case 3:
                    System.out.println("Произведение A и B равно " + (A * B));
                    break;
                case 4:
                    System.out.println("Частное от деления A на B равно " + (A / B));
                    break;
            }
        }
        //Операторы. Дополнительное задание 6
        {
            int a = 999;
            System.out.print(a + " - ");
            if (a % 2 == 0) {
                System.out.print("четное ");
            } else {
                System.out.print("нечетное ");
            }
            if (a / 10 < 1) {
                System.out.println("однозначное число");
            } else if (a / 100 < 1) {
                System.out.println("двузначное число");
            } else {
                System.out.println("трехзначное число");
            }
        }
        //Операторы. Дополнительное задание 7
        {
            int D = 19;
            int M = 4;
            System.out.print("D = " + D + ", M = " + M + ". ");
            if ((D >= 20 && M == 1) || (D <= 18 && M == 2)) {
                System.out.println("Водолей");
            } else if ((D >= 19 && M == 2) || (D <= 20 && M == 3)) {
                System.out.println("Рыбы");
            } else if ((D >= 21 && M == 3) || (D <= 19 && M == 4)) {
                System.out.println("Овен");
            } else if ((D >= 20 && M == 4) || (D <= 20 && M == 5)) {
                System.out.println("Телец");
            } else if ((D >= 21 && M == 5) || (D <= 21 && M == 6)) {
                System.out.println("Близнецы");
            } else if ((D >= 22 && M == 6) || (D <= 22 && M == 7)) {
                System.out.println("Рак");
            } else if ((D >= 23 && M == 7) || (D <= 22 && M == 8)) {
                System.out.println("Лев");
            } else if ((D >= 23 && M == 8) || (D <= 22 && M == 9)) {
                System.out.println("Дева");
            } else if ((D >= 23 && M == 9) || (D <= 22 && M == 10)) {
                System.out.println("Весы");
            } else if ((D >= 23 && M == 10) || (D <= 22 && M == 11)) {
                System.out.println("Скорпион");
            } else if ((D >= 23 && M == 11) || (D <= 21 && M == 12)) {
                System.out.println("Стрелец");
            } else if ((D >= 22 && M == 12) || (D <= 19 && M == 1)) {
                System.out.println("Козерог");
            }
        }
        //Операторы. Дополнительное задание 8
        {
            int N = 4;
            int M = 12;
            System.out.print("N = " + N + ", M = " + M + ". ");
            switch (M) {
                case 6:
                    System.out.print("Шестерка ");
                    break;
                case 7:
                    System.out.print("Семерка ");
                    break;
                case 8:
                    System.out.print("Восьмерка ");
                    break;
                case 9:
                    System.out.print("Девятка ");
                    break;
                case 10:
                    System.out.print("Десятка ");
                    break;
                case 11:
                    System.out.print("Валет ");
                    break;
                case 12:
                    System.out.print("Дама ");
                    break;
                case 13:
                    System.out.print("Король ");
                    break;
                case 14:
                    System.out.print("Туз ");
                    break;
            }
            switch (N) {
                case 1:
                    System.out.println("пик");
                    break;
                case 2:
                    System.out.println("треф");
                    break;
                case 3:
                    System.out.println("бубен");
                    break;
                case 4:
                    System.out.println("червей");
                    break;
            }
        }
        //Циклы. Обязательное задание 1
        {
            int i = 1;
            while (i <= 5) {
                System.out.println("Task" + i);
                i++;
            }
        }
        //Циклы. Обязательное задание 2
        {
            int i = 1;
            do {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= 100);
        }
        //Циклы. Обязательное задание 3
        {
            int N = 5; //число, для которого считаем факториал
            int factorial = 1;
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + N + " равен " + factorial);
        }
        //Циклы. Обязательное задание 4
        {
            int A = 3;
            int B = 8;
            int N = 0;
            System.out.println("A = " + A + ", B = " + B);
            for (int i = B - 1; i > A; i--) {
                System.out.println(i);
                N++;
            }
            System.out.println("Количество чисел между A и B равно " + N);
        }
        //Циклы. Дополнительное задание 5
        {
            int A = 15;
            int B = 4;
            System.out.print("A = " + A + ", B = " + B + ". Длина незанятой части отрезка A равна ");
            do {
                A -= B;
            } while (A > B);
            System.out.println(A);
        }
        //Циклы. Дополнительное задание 6
        {
            int A = 7;
            int B = 9;
            int C = 2;
            int width = 0;
            int length = 0;
            System.out.print("A = " + A + ", B = " + B + ", C = " + C + ". Количество квадратов равно ");
            while (A >= C) {
                A -= C;
                width++;
            }
            while (B >= C) {
                B -= C;
                length++;
            }
            System.out.println(width * length);
        }
        //Циклы. Дополнительное задание 7
        {
            int N = 29;
            boolean is2 = false;
            int otherN = 0;
            int countN = 0;
            int sumN = 0;
            System.out.print("В числе " + N);
            while (N % 10 > 1) {
                if (N % 10 == 2 && !is2) {
                    is2 = true;
                }
                otherN = otherN * 10 + N % 10;
                countN++;
                sumN += N % 10;
                N /= 10;
            }
            if (!is2) {
                System.out.print(" отсутствует цифра 2; ");
            } else {
                System.out.print(" присутствует цифра 2; ");
            }
            System.out.println("обратное число - " + otherN + "; количество цифр равно " + countN + "; сумма цифр равна " + sumN);
        }
        //Циклы. Дополнительное задание 8
        {
            double S = 1000;
            double P = 5.5;
            int K = 0;
            System.out.print("Вклад на сумму 1000 с процентом " + P + " в месяц превысит 1100 через количество месяцев равное ");
            while (S <= 1100) {
                S = S + S * P / 100;
                K++;
            }
            System.out.println(K + " и составит " + S + " руб.");
        }
    }
}