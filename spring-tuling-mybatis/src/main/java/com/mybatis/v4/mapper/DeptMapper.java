package com.mybatis.v4.mapper;


import com.mybatis.v4.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by smlz on 2019/3/22.
 */
public interface DeptMapper {


    Dept findOne(Integer id);

    List<Dept> list();

    int save(Dept dept);

    List<Dept> findDepts(@Param("list") List<Integer> ids);

    Dept findDeptByIdAndName(@Param("id") Integer id,@Param("name") String name);

}
