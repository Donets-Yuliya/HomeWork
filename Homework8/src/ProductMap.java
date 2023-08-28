import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

    public abstract class ProductMap {

        public static void PrintEntrySet (HashMap<Integer, Product> map) {
            for (Map.Entry<Integer, Product> set : map.entrySet()) {
                System.out.println("Код товара - " + set.getKey() + ", товар - " + set.getValue());
            }
        }

        public static void PrintKeySet (HashMap<Integer, Product> map) {
            for (Integer key : map.keySet()) {
                System.out.println(key);
            }
        }

        public static void PrintValues (HashMap<Integer, Product> map) {
            for (Product value : map.values()) {
                System.out.println(value.toString());
            }
        }

        public static void Main() {
            HashMap<Integer, Product> hashMap = new HashMap<Integer, Product>();
            hashMap.put(1200, new Product("Хлеб", 3.25));
            hashMap.put(1201, new Product("Лук", 1.3));
            hashMap.put(1202, new Product("Арбуз", 2.5));

            System.out.println("Пары значений:");
            PrintEntrySet(hashMap);
            System.out.println("Значения ключей:");
            PrintKeySet(hashMap);
            System.out.println("Значения товаров:");
            PrintValues(hashMap);
        }
    }
