import com.sankuai.meituan.qz.waimai.dao.WmOrderDao;
import com.sankuai.meituan.qz.waimai.domain.WmOrder;
import com.sankuai.meituan.qz.waimai.web.WmOrderApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:qz_waimai.xml"})
public class NomalTest {
    @Autowired
    private WmOrderDao wmOrderDao;
    @Autowired
    private WmOrderApi wmOrderApi;

    @Test
    public void test_orderDao() {
        WmOrder wmOrder = new WmOrder()
                .setType(3).setStatus(2).setCustomerId(1997).setAddr("哈商大").setCurrentPrice(15).setOrigPrice(19.8);

        wmOrderDao.insert(wmOrder);

        List<WmOrder> wmOrder1 = wmOrderDao.pageQuery(1, 100, 1997);
    }

    @Test
    public void test_customerDao(){
        WmOrder wmOrder = new WmOrder()
                .setType(3).setStatus(2).setCustomerId(1997).setAddr("哈商大").setCurrentPrice(15).setOrigPrice(17.8);
        wmOrderApi.placeOrder(wmOrder);

        Object wmOrder1 = wmOrderApi.getOrders(1, 100, (long)1997);
    }
}
