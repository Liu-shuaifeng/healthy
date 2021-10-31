import com.move.dao.ItemsDao;
import com.move.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Liushuaifeng
 * @version 2021/10/29 17:02
 */

public class ItemsTest {

    @Test
    public void t(){

        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("application-dao.xml");

        ItemsDao itemsDao = cs.getBean(ItemsDao.class);

        List<Items> all = itemsDao.findAll();

        all.forEach(System.out::println);

    }

}
