package LibraryPack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static boolean saveReaderList(List<Reader> readers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\LibraryPack\\readers.dat"))) {
            oos.writeObject(readers);
            return true;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static List<Reader> restoreReadersList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\LibraryPack\\readers.dat"))) {
             List<Reader> list = (List<Reader>) ois.readObject();
            System.out.println("Читатели загружены");
            return list;
        }
        catch (FileNotFoundException fnf) {
            System.out.println("Читатели отсутствуют");
            return new ArrayList<>();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
