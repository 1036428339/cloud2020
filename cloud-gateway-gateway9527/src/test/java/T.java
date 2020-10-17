import java.time.ZonedDateTime;

/**
 * @author lwc
 * @date 2020/10/17 10:01
 */
public class T {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2020-02-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}
