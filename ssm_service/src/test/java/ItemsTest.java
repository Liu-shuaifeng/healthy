import com.move.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 17:27
 */
public class ItemsTest {

    @Test
    public void t(){

        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("application-service.xml");

        ItemsService bean = cs.getBean(ItemsService.class);
        bean.findAll().forEach(System.out::println);
    }
}
