package com.example.dao;

import com.example.pojo.teachercomment;
import java.util.List;

public interface teachercommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TeaComment
     *
     * @mbg.generated
     */
    int insert(teachercomment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TeaComment
     *
     * @mbg.generated
     */
    List<teachercomment> selectAll();

    /**
     *
     * 注意这个检索条件是teacherid
     */
    List<teachercomment> gaincomment(String Courseid);
}