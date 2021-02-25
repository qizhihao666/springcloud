package spring.cloud.product.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 详细描述：ProductController
 * 作者：ZhiHao Qi
 * 时间：2021/2/24 14:52
 */
@RestController
@RequestMapping("/productsController")
public class ProductController {

    @RequestMapping("/getProducts")
    public String getProducts(){
        System.out.println("6666");
        return "this is a productsController";
    }

}
