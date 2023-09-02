package Files;

import java.io.*;

public class Files {

    public static void WriteFile(String path) {
        File catalog = new File(path);
        File [] files = catalog.listFiles();
        File result = new File(path + "\\result.txt");

        result.delete();
        try {
            result.createNewFile();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\result.txt"))) {
            for (File file : files) {
                if (file.isFile() && !file.getName().equals("result.txt")) {

                    try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {
                        String s;
                        while ((s = br.readLine()) != null) {
                            bw.write(s);
                        }
                    }

                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
