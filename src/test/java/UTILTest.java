import com.shishuo.cms.util.AuthUtils;

/**
 * Created by cc on 16-10-8.
 */
public class UTILTest {
    public static void main(String ad[]){
      String str=  AuthUtils.getPassword("cctest");
        System.out.println(str);
    }
}
