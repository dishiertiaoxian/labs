package cn.edu.sdu.ise.labs.controller;

import cn.edu.sdu.ise.labs.annotation.NeedNoToken;
import cn.edu.sdu.ise.labs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门管理后端服务模块
 *
 * @author 赵桐
 * @description
 * @date 2021/3/21
 */

@RestController
@RequestMapping("user")
public class MyController {

    @Autowired
    private TestService testService;

    @NeedNoToken
    @GetMapping(" add")
    public String add(String userName, String persId) {
//        Token token = TokenContextHolder.getToken();
//        return token.getUserCode();
        return testService.add(userName, persId);
    }
}

