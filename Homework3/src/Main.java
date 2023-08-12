import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Основное задание
        {
            Phone phone1 = new Phone(5553566, "Samsung", 300);
            Phone phone2 = new Phone(5553598, "Apple");
            Phone phone3 = new Phone();

            System.out.println("Значение переменных экземпляра 1:");
            System.out.println("number = " + phone1.number + ", model = " + phone1.model + ", weight = " + phone1.weight);
            System.out.println("Значение переменных экземпляра 2:");
            System.out.println("number = " + phone2.number + ", model = " + phone2.model + ", weight = " + phone2.weight);
            System.out.println("Значение переменных экземпляра 3:");
            System.out.println("number = " + phone3.number + ", model = " + phone3.model + ", weight = " + phone3.weight);

            phone1.receiveCall("Василий Петрович");
            phone2.receiveCall("Мария Ивановна");
            phone3.receiveCall("Екатерина Великая");

            System.out.println("GetNumber для экземпляра 1: " + phone1.getNumber());
            System.out.println("GetNumber для экземпляра 2: " + phone2.getNumber());
            System.out.println("GetNumber для экземпляра 3: " + phone3.getNumber());

            Phone.receiveCall("Василий Петрович", 5553535);
            System.out.println("Введены следующие номера телефонов:");
            Phone.sendMessage(5553535, 5553536, 5553538, 5553540);
        }
        //Дополнительное задание
        {
            Scanner scanner = new Scanner(System.in);
            IntArray int1 = new IntArray(5);
            IntArray int2 = new IntArray(1, 2, 6, 18, 0, -6, 54, 28);
            IntArray int3 = new IntArray();

            int1.setValues(1, 2, 3, 4, 5);
            int3.setRandomValues();
            int2.Sort(true);
            int3.Sort(false);

            System.out.println("Элементы массива 1:");
            int1.PrintArray();
            System.out.println("Элементы массива 2:");
            int2.PrintArray();
            System.out.println("Элементы массива 3:");
            int3.PrintArray();

            int1.setLength(10);
            int1.setRandomValues(-5, 80);

            System.out.println("Элементы массива 1:");
            int1.PrintArray();

            int[] int4 = int1.getValues();

            System.out.println("Элементы массива 4:");
            for (int i : int4) {
                System.out.print(i + ", ");
            }
            System.out.println();
            System.out.println("Количество элементов массива 3 равно " + int3.getLength());
            System.out.println("Элемент 2 массива 3 равен " + int3.getValue(2));

            IntArray int5;
            System.out.println("Введите число элементов массива:");
            int5 = new IntArray(scanner.nextInt());
            for (int i = 0; i < int5.getLength(); i++) {
                System.out.println("Введите " + i + " элемент массива:");
                int5.setValue(i, scanner.nextInt());
            }
            scanner.nextLine();

            System.out.println("Элементы массива 5:");
            int5.PrintArray();
        }
    }
}