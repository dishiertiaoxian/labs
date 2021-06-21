package cn.edu.sdu.ise.labs.dao;

import cn.edu.sdu.ise.labs.model.Test;

import java.util.List;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    Test selectByPrimaryKey(Integer id);    //只能返回一条记录id

    int updateByPrimaryKey(Test record); //自动生成的增删改查操作

    //返回多条记录
    List<Test> ListByKeyword(String keyword, int page, int pageSize);   //自己写的函数，mybatis 不会自动创建seq语句，要在.xml文件自己创建新的seq语句
}