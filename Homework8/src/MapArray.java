import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class MapArray {

    public static <K> Map<K, Integer> ArrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();

        for (K array : ks) {
            if (map.containsKey(array)) {
                map.put(array, map.get(array) + 1);
            }
            else {
                map.put(array, 1);
            }
        }
        return map;
    }

    public static <K> void PrintMap(Map<K, Integer> map) {
        for (Map.Entry<K, Integer> set : map.entrySet()) {
            System.out.println("Элемент массива - " + set.getKey() + ", количество вхождений - " + set.getValue());
        }
    }

    public static <K> void PrintArray(K[] ks) {
        System.out.println("Элементы массива:");
        for (K i : ks) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void Main() {
        Integer[] ks = {1,2,4,4};
        PrintArray(ks);
        Map<Integer, Integer> mapInt = ArrayToMap(ks);
        PrintMap(mapInt);

        String[] str = {"Str1","Str1","Str1","Str2","Str3","Str4","Str2","Str5"};
        PrintArray(str);
        Map<String, Integer> mapStr = ArrayToMap(str);
        PrintMap(mapStr);
    }
}
