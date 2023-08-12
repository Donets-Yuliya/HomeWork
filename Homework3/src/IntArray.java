import java.util.Arrays;

public class IntArray {
    private int[] values;
    private int length;

    public IntArray() {
        values = new int[10];
        length = values.length;
    }

    public IntArray(int length) {
        values = new int[length];
        this.length = values.length;
    }

    public IntArray(int ... element) {
        values = element;
        length = values.length;
    }

    public void Sort(boolean isAsc) {
        if (isAsc) {
            Arrays.sort(values);
        } else
        {
            Arrays.sort(values);
            for (int i = 0; i < values.length / 2; i++) {
                int temp = values[i];
                values[i] = values[values.length - 1 - i];
                values[values.length - 1 - i] = temp;
            }
        }
    }

    public void PrintArray() {
        for (int i : values) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


    public void setValue(int elementNumber, int elementValue) {
        if (elementNumber >= values.length || elementNumber < 0) {
            System.out.println("Неверно задан номер элемента массива");
        } else {
            values[elementNumber] = elementValue;
        }
    }

    public void setValues(int ... elements) {
        if (elements.length != values.length) {
            System.out.println("Неверно задано количество элементов массива");
        } else {
            for (int i = 0; i < values.length; i++) {
                values[i] = elements[i];
            }
        }
    }

    public void setRandomValues() {
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) ((Math.random() * (1000 - 1)) + 1);
        }
    }

    public void setRandomValues(int min, int max) {
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) ((Math.random() * (max - min)) + min);
        }
    }

    public void setLength(int length) {
        if (length <= 0) {
            System.out.println("Неверно задано количество элементов массива");
        } else {
            values = new int[length];
            this.length = values.length;
        }
    }

    public int[] getValues() {
        return values;
    }

    public int getValue(int elementNumber) {
        return values[elementNumber];
    }

    public int getLength() {
        return length;
    }
}
