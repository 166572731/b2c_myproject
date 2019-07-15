package org.java.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.java.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectByPrimaryKey(@Param("uid") Integer uid);
}