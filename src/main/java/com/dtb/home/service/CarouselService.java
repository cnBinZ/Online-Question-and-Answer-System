package com.dtb.home.service;

import com.dtb.entity.Carousel;

import java.util.List;

/**
 * @Author：banglin
 * @Description：轮播图服务类
 * @Date：Created on 0:24 2021/3/11.
 * @ModifyBy：
 */
public interface CarouselService {

    /**
     * @auther banglin
     * @date 2021/3/11 0:24
     * @descript 获取轮播图列表
     * @return java.util.List<com.dtb.entity.Carousel>
     */
    List<Carousel> findCarouselList();
}
