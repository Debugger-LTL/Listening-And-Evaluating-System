package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table example_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table example_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table example_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table example_user
     *
     * @mbg.generated
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table example_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(@Param("user") User record);


    /**
     *判断用户名是否存在
     */
    Integer findByUsername(@Param("username") String username);

    /**
     * 根据用户名和密码查询
     */
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 判断邮箱是否存在
     */
    Integer findByEmail(@Param("email") String email);

    /**
     * 重置密码
     */
    int XmlResetPassword(String username,String password);

    /**
     * 修改密码
     */
    int alterPasswordByUsernameAndPrepassword(String username,String password);
}