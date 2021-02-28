package spring.cloud.merchant.clients.fallbacks;

import org.springframework.stereotype.Service;
import spring.cloud.merchant.clients.ProductsClient;

/**
 * 详细描述：ProductsImpl
 * 作者：ZhiHao Qi
 * 时间：2021/2/24 14:49
 */
@Service
public class ProductsImpl implements ProductsClient {
    @Override
    public String getProducts() {
        return "error";
    }
}
