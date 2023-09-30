import java.util.Hashtable;

public class ImpleHashM {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();

        table.put("111", "Bob");
        table.put("112", "Cindy");
        table.put("113", "Gary");

        //table.remove(110);

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table.get(key));
        }

    }
}
