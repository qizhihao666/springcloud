package spring.cloud.merchant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.cloud.merchant.contoller.MerchantController;
import spring.cloud.redis.utils.RedisUtil;

@SpringBootTest
class MerchantApplicationTests {

    @Autowired
    private MerchantController merchantController;

    @Autowired
    public RedisUtil redisUtil;

    @Test
    public void testRedis(){
        Object test = redisUtil.get("test");
        System.out.println(test);
    }

    @Test
    void contextLoads() {
//        merchantController.getMerchantProducts();
//        merchantController.testHys();

    }

}
