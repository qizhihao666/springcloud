package spring.cloud.merchant.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.cloud.merchant.clients.fallbacks.ProductsImpl;

/**
 * 详细描述：ProductsClient
 * 作者：ZhiHao Qi
 * 时间：2021/2/24 14:49
 */
@FeignClient(name = "SPRING-CLOUD-PRODUCT",fallback = ProductsImpl.class)
@Component
public interface ProductsClient {

    @RequestMapping("/productsController/getProducts")
    public String getProducts();

}
