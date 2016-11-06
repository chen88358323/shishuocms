package com.shishuo.cms.service;

import com.shishuo.cms.entity.Admin;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by chen.cc on 16/11/7.
 */
public class AdminServiceTest extends BaseServiceTest {
    private static final Logger ll = Logger.getLogger(AdminServiceTest.class);

    @Autowired
    private AdminService adminService;

    /*****
     * 测试查询
     *
     * */
    @Test
    public void queryTest(){

        Admin a=adminService.getAdminById(1);
        if(a==null)
            ll.info("none");
        else{
            ll.info(a.getName());
        }

    }
}
