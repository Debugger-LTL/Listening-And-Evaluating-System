package com.example.dao;

import com.example.pojo.StudentAssignment;
import java.util.List;

public interface StudentAssignmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table StudentAssignmentList
     *
     * @mbg.generated
     */
    int insert(StudentAssignment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table StudentAssignmentList
     *
     * @mbg.generated
     */
    List<StudentAssignment> selectAll();

    int setStatusOK(String studentid,String courseid);

    List<StudentAssignment> GetAllCourse(String studentId);
}