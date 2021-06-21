package cn.edu.sdu.ise.labs.service.impl;

import cn.edu.sdu.ise.labs.dao.TestMapper;
import cn.edu.sdu.ise.labs.model.Test;
import cn.edu.sdu.ise.labs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public String add(String name, String persId) {
        Test test = new Test();
        test.setName(name);
        test.setPersId(persId);
        testMapper.insert(test); //将新生成的test数据对象插入到数据库
        return null;
    }
}
