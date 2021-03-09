package spring.cloud.merchant.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.merchant.service.MerchantService;
import spring.cloud.redis.utils.RedisUtil;

/**
 * 详细描述：MerchantController
 * 作者：ZhiHao Qi
 * 时间：2021/2/24 14:46
 */
@RestController
@RequestMapping("/merchantController")
public class MerchantController {

    @Autowired
    private RedisUtil redisUtil;

//
//    @Autowired
    private MerchantService merchantService;

    @Autowired
    public MerchantController(MerchantService merchantService){
        this.merchantService = merchantService;
    }


    @RequestMapping("/getMerchantProducts")
    public void getMerchantProducts(){
        String products = merchantService.getProducts();
        System.out.println(products);
    }

    public void testHys(){
        String products = merchantService.testHystrix();
        System.out.println(products);
    }

}
