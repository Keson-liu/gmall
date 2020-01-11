package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    private ProductService productService;

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

//        Product byId = productService.getById(1);
//        System.out.println(byId.getName());
//        Brand brand = new Brand();
//        brand.setName("heheh");
//        brandService.save(brand);

        Brand brand = brandService.getById(53);
        System.out.println(brand.getName());
    }

}
