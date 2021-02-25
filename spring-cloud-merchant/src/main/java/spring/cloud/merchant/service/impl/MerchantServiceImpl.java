package spring.cloud.merchant.service.impl;

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
        String products = productsClient.getProducts();
        System.out.println(products);
        return null;
    }
}
