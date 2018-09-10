import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class BookMap {
    public static final String BOOK_MAP_CONFIGURATION = "books";
    public static HashMap<String, String> hashMap = new HashMap<String, String>();

    static {
        loadBooksMapping();
    }

    static Book getBook(String name) {
        Book book = null;
        String className = hashMap.get(name);
        if(className != null) {
            try {
                Class cls = Class.forName(className);
                book = (Book) cls.newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return book;
    }

    static void loadBooksMapping() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BOOK_MAP_CONFIGURATION, Locale.getDefault());
        Enumeration<String> enumeration = resourceBundle.getKeys();
        while(enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String value = resourceBundle.getString(key);
            hashMap.put(key, value);
        }
    }
}
