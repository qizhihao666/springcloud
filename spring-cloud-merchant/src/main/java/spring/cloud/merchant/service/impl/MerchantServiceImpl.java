package spring.cloud.merchant.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cloud.merchant.clients.ProductsClient;
import spring.cloud.merchant.service.MerchantService;

/**
 * 详细描述：MerchantServiceImpl
 * 作者：ZhiHao Qi
 * 时间：2021/2/24 14:48
 */
@Service
public class MerchantServiceImpl implements MerchantService {

   private ProductsClient productsClient;


   @Autowired
   public MerchantServiceImpl(ProductsClient productsClient){
       this.productsClient = productsClient;
   }

    @Override
    public String getProducts() {

//        System.out.println(products);
        return productsClient.getProducts();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getHystrix")
    public String testHystrix() {
        throw new RuntimeException("chu cuo le");
    }

    public String getHystrix(){
       return "this is a hys";
    }

}
