import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class WordConunter {
    public static void main(String[] args) throws IOException {
        String str = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            // put input.txt file in the project file or give absolute path location of the file.
            str = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(str);

        str=str.trim().replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(str);
        String words []= str.split(" ");
        TreeMap<String, Integer> wCount = new TreeMap<>();
        for (String word : words) {
            wCount.put(word, wCount.getOrDefault(word, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : wCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

