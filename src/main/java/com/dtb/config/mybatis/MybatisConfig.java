package com.dtb.config.mybatis;

/**
 * @auther: banglin
 * @descript:
 * @date: 2021/2/28 20:28
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan({"com.dtb.admin.dao","com.dtb.home.dao"})
@Configuration
public class MybatisConfig {
}
