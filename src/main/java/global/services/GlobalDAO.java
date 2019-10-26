package global.services;

/**
 * Created by ashutosh on 9/27/2019.
 */
public class GlobalDAO {
    private static Integer count;
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GlobalDAO.name = name;
    }

    public static Integer getCount() {
        return count;
    }

    public static void setCount(Integer count) {
        GlobalDAO.count = count;
    }
}
