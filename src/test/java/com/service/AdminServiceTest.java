package com.service;

import com.shishuo.cms.entity.Admin;
import com.shishuo.cms.entity.vo.PageVo;
import com.shishuo.cms.service.AdminService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by cc on 16-10-15.
 */
public class AdminServiceTest extends BaseTest    {

    @Autowired
    private AdminService  adminService;
    @Test
    public void getAllList(){
//        AdminService  adminService=(AdminService)ctx.getBean("adminService");

        List<Admin> list=adminService.getAllList(0,20);
        if(list!=null&&list.size()>0){
            ll.info("**list size is "+list.size());
        }
    }
}
