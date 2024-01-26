package com.dtb;

import com.dtb.home.service.GiftService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhang
 * @version 1.0.0
 * @create 2021/3/23-22:27
 */
public class GiftServiceTest extends DtbApplicationTests {
    @Autowired
    private GiftService giftService;

    @Test
    public void findByIdTest() {
        System.out.println(giftService.findById(1).getGiftName());
    }
}
