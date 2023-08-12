public class Phone {
    public int number;
    public String model;
    public int weight;

    public Phone() {
        this.number = 0;
        this.model = "Нет модели";
        this.weight = 0;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this (number, model);
        this.weight = weight;
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", номер телефона " + number);
    }

    public static void sendMessage(int ... number) {
        for (int i : number) {
            System.out.print(i + ", ");
        }

        System.out.println();
    }

    public int getNumber() {
        return number;
    }
}
