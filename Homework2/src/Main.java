import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Массивы. Обязательное задание 1
        {
            int[] int_array = new int[4];
            boolean is_asc = true;
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (99 - 10)) + 10);
            }
            for (int i = 0; i < int_array.length - 1; i++) {
                if (int_array[i] >= int_array[i + 1]) {
                    is_asc = false;
                    break;
                }
            }
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            if (is_asc) {
                System.out.println("- массив является строго возрастающей последовательностью");
            } else {
                System.out.println("- массив не является строго возрастающей последовательностью");
            }
        }
        //Массивы. Обязательное задание 2
        {
            Scanner scanner = new Scanner(System.in);
            int array_length, min_value, max_value;
            do {
                System.out.println("Введите размер массива: ");
                array_length = scanner.nextInt();
            } while (array_length <= 0);
            do {
                System.out.println("Введите нижнюю границу диапазона массива: ");
                min_value = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона массива: ");
                max_value = scanner.nextInt();
            } while (min_value > max_value);
            int[] int_array = new int[array_length];
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (max_value - min_value)) + min_value);
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //Массивы. Обязательное задание 3
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;
            do {
                System.out.println("Введите размер массива: ");
                N = scanner.nextInt();
            } while (N <= 0);
            do {
                System.out.println("Введите нижнюю границу диапазона массива: ");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона массива: ");
                B = scanner.nextInt();
            } while (A > B);
            int[] int_array = new int[N];
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (B - A)) + A);
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
            int max_index = 0;
            for (int i = 1; i < int_array.length; i++) {
                if (int_array[i] > int_array[max_index]) {
                    max_index = i;
                }
            }
            System.out.println("Максимальный элемент равен " + int_array[max_index] + " с индексом " + max_index);
        }
        //Массивы. Обязательное задание 4
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;
            do {
                System.out.println("Введите размер массива: ");
                N = scanner.nextInt();
            } while (N <= 0);
            do {
                System.out.println("Введите нижнюю границу диапазона массива: ");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона массива: ");
                B = scanner.nextInt();
            } while (A > B);
            int[] int_array = new int[N];
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (B - A)) + A);
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
            int temp_element;
            //сортировка
            for (int i = 0; i < int_array.length; i++) {
                for (int j = 0; j < int_array.length - 1 - i; j++) {
                    if (int_array[j] > int_array[j + 1]) {
                        temp_element = int_array[j];
                        int_array[j] = int_array[j + 1];
                        int_array[j + 1] = temp_element;
                    }
                }
            }
            System.out.print("Отсортированные элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //Массивы. Дополнительное задание 5
        {
            Scanner scanner = new Scanner(System.in);
            int[] int_array = new int[20];
            boolean is_element = false;
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (1000 - 1)) + 1);
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Введите искомое значение n: ");
            int n = scanner.nextInt();
            for (int i = 0; i < int_array.length; i++) {
                if (int_array[i] == n) {
                    System.out.println("Число " + n + " присутствует в массиве с индексом " + i);
                    is_element = true;
                    break;
                }
            }
            if (!is_element) {
                System.out.println("Число " + n + " отсутствует в массиве");
            }
        }
        //Массивы. Дополнительное задание 6
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;
            do {
                System.out.println("Введите размер массива: ");
                N = scanner.nextInt();
            } while (N <= 0);
            do {
                System.out.println("Введите нижнюю границу диапазона массива: ");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона массива: ");
                B = scanner.nextInt();
            } while (A > B);
            int[] int_array = new int[N];
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (B - A)) + A);
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
            int temp_element;
            for (int i = 0; i < int_array.length / 2; i++) {
                temp_element = int_array[i];
                int_array[i] = int_array[int_array.length - 1 - i];
                int_array[int_array.length - 1 - i] = temp_element;
            }
            System.out.print("Элементы инвертированного массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //Массивы. Дополнительное задание 7
        {
            Scanner scanner = new Scanner(System.in);
            int N, A, B;
            do {
                System.out.println("Введите размер массива: ");
                N = scanner.nextInt();
            } while (N <= 0);
            do {
                System.out.println("Введите нижнюю границу диапазона массива: ");
                A = scanner.nextInt();
                System.out.println("Введите верхнюю границу диапазона массива: ");
                B = scanner.nextInt();
            } while (A > B);
            int[] int_array = new int[N];
            for (int i = 0; i < int_array.length; i++) {
                int_array[i] = (int) ((Math.random() * (B - A)) + A);
            }
            int temp_element;
            //сортировка
            for (int i = 0; i < int_array.length; i++) {
                for (int j = 0; j < int_array.length - 1 - i; j++) {
                    if (int_array[j] > int_array[j + 1]) {
                        temp_element = int_array[j];
                        int_array[j] = int_array[j + 1];
                        int_array[j + 1] = temp_element;
                    }
                }
            }
            System.out.print("Элементы массива: ");
            for (int i : int_array) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Введите искомое значение k: ");
            int k = scanner.nextInt();
            int step_count = 0;
            for (int i = 0; i < int_array.length - 1; i++) {
                step_count++;
                if (int_array[i] == k) {
                    System.out.println("Индекс элемента: " + i);
                    System.out.println("Количество шагов линейного поиска: " + step_count);
                    break;
                }
            }
            step_count = 0;
            boolean is_element = false;
            int left_index = 0;
            int right_index = int_array.length - 1;
            int middle_index;
            while (left_index <= right_index) {
                step_count++;
                middle_index = (left_index + right_index) / 2;
                if (int_array[middle_index] == k) {
                    is_element = true;
                    System.out.println("Количество шагов двоичного поиска: " + step_count);
                    break;
                } else if (int_array[middle_index] > k) {
                    right_index = middle_index - 1;
                } else if (int_array[middle_index] < k){
                    left_index = middle_index + 1;
                }
            }
            if (!is_element) {
                System.out.println("Число " + k + " отсутствует в массиве");
            }
        }
        //Строки. Задание 1
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            System.out.println("Введите символ: ");
            char chr = scanner.nextLine().toCharArray()[0];
            char[] chr_array = str.toCharArray();
            int chr_count = 0;
            for (char i : chr_array) {
                if (i == chr) {
                    chr_count++;
                }
            }
            System.out.println("Количество символов " + chr + " в строке " + str + " равно " + chr_count);
        }
        //Строки. Задание 2
        {
            Scanner scanner = new Scanner(System.in);
            String str;
            do {
                System.out.println("Введите строку: ");
                str = scanner.nextLine();
            } while (str.isEmpty());
            char[] chr_array = str.toCharArray();
            System.out.println("Введите символ a: ");
            char a = scanner.nextLine().toCharArray()[0];
            System.out.println("Введите символ b: ");
            char b = scanner.nextLine().toCharArray()[0];
            for (int i = 0; i < chr_array.length; i++) {
                if (chr_array[i] == a) {
                    chr_array[i] = b;
                }
            }
            str = new String(chr_array);
            System.out.println("Замененная строка: " + str);
        }
    }
}