package spring.cloud.merchant;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.cloud.merchant.contoller.MerchantController;

@SpringBootTest
class MerchantApplicationTests {

    @Autowired
    private MerchantController merchantController;

    @Test
    void contextLoads() {
        merchantController.getMerchantProducts();
    }

}
