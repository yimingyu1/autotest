import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * ClassName: SuiteConfig
 * Description:
 * date: 2021/3/27 下午4:08
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class SuiteConfig {

    @BeforeSuite
    public void test1(){
        System.out.println("beforeSuit");
    }

    @AfterSuite
    public void test2(){
        System.out.println("afterSuit");
    }
}
