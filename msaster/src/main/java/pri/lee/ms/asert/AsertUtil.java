package pri.lee.ms.asert;

/**
 * @Author:li
 * @Date:created in 2018/1/25 13:17
 */
public class AsertUtil {
    public static void asert(boolean val, String msg) {
        if (!val) {
            try {
                throw new Exception(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
