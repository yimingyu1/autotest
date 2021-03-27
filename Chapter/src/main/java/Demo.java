import org.testng.annotations.Test;

/**
 * ClassName: Demo
 * Description:
 * date: 2021/3/27 下午1:57
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Demo {

    @Test(groups = {"asdfa", "fasdf"})
    public void test1(){
        System.out.println("group");
    }
}
