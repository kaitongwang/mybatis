package com.mmall.dao;

import com.lajd.pojo.User;

public interface UserMapper {
    /**
     * 根据id删除一条记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 无选择的插入一条记录
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 有选择的插入一条记录
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}