package com.monster.demo.dao.user;

import com.monster.demo.pojo.po.user.UserBaseInfo;

public interface UserBaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBaseInfo record);

    int insertSelective(UserBaseInfo record);

    UserBaseInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBaseInfo record);

    int updateByPrimaryKey(UserBaseInfo record);
}