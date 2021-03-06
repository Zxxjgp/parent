package com.org.spring.transactiondemo.dao;

import com.org.spring.transactiondemo.entity.TestEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName TestMapper
 * @date 2020/3/15  22:17
 */
public interface TestMapper {

    @Select("select * from T_TEST")
    List<TestEntity> getTest();

/*    @SelectKey(keyProperty = "para.id",resultType = String.class, before = true,
            statement = "select replace(uuid(), '-', '')")*/
    @Insert("insert into T_TEST values (#{para.id}, #{para.name})")
    int insert(@Param("para") TestEntity para);
}
