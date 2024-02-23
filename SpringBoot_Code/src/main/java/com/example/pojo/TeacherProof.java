package com.example.pojo;

import java.util.Date;

import static utils.DateUtil.date2String;

public class TeacherProof {
    private String academy;

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.teacher_id
     *
     * @mbg.generated
     */
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.teacher_name
     *
     * @mbg.generated
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.course_id
     *
     * @mbg.generated
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.course_name
     *
     * @mbg.generated
     */
    private String courseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.listened_teacher_name
     *
     * @mbg.generated
     */
    private String listenedTeacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.listened_teacher_id
     *
     * @mbg.generated
     */
    private String listenedTeacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.classpic
     *
     * @mbg.generated
     */
    private String classpic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.listen_time
     *
     * @mbg.generated
     */
    private Date listenTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TeaProof.semester
     *
     * @mbg.generated
     */
    private String semester;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.teacher_id
     *
     * @return the value of TeaProof.teacher_id
     *
     * @mbg.generated
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.teacher_id
     *
     * @param teacherId the value for TeaProof.teacher_id
     *
     * @mbg.generated
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.teacher_name
     *
     * @return the value of TeaProof.teacher_name
     *
     * @mbg.generated
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.teacher_name
     *
     * @param teacherName the value for TeaProof.teacher_name
     *
     * @mbg.generated
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.course_id
     *
     * @return the value of TeaProof.course_id
     *
     * @mbg.generated
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.course_id
     *
     * @param courseId the value for TeaProof.course_id
     *
     * @mbg.generated
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.course_name
     *
     * @return the value of TeaProof.course_name
     *
     * @mbg.generated
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.course_name
     *
     * @param courseName the value for TeaProof.course_name
     *
     * @mbg.generated
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.listened_teacher_name
     *
     * @return the value of TeaProof.listened_teacher_name
     *
     * @mbg.generated
     */
    public String getListenedTeacherName() {
        return listenedTeacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.listened_teacher_name
     *
     * @param listenedTeacherName the value for TeaProof.listened_teacher_name
     *
     * @mbg.generated
     */
    public void setListenedTeacherName(String listenedTeacherName) {
        this.listenedTeacherName = listenedTeacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.listened_teacher_id
     *
     * @return the value of TeaProof.listened_teacher_id
     *
     * @mbg.generated
     */
    public String getListenedTeacherId() {
        return listenedTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.listened_teacher_id
     *
     * @param listenedTeacherId the value for TeaProof.listened_teacher_id
     *
     * @mbg.generated
     */
    public void setListenedTeacherId(String listenedTeacherId) {
        this.listenedTeacherId = listenedTeacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.classpic
     *
     * @return the value of TeaProof.classpic
     *
     * @mbg.generated
     */
    public String getClasspic() {
        return classpic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.classpic
     *
     * @param classpic the value for TeaProof.classpic
     *
     * @mbg.generated
     */
    public void setClasspic(String classpic) {
        this.classpic = classpic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.listen_time
     *
     * @return the value of TeaProof.listen_time
     *
     * @mbg.generated
     */
    public String getListenTime() {
        return date2String(listenTime);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.listen_time
     *
     * @param listenTime the value for TeaProof.listen_time
     *
     * @mbg.generated
     */
    public void setListenTime(Date listenTime) {
        this.listenTime = listenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TeaProof.semester
     *
     * @return the value of TeaProof.semester
     *
     * @mbg.generated
     */
    public String getSemester() {
        return semester;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TeaProof.semester
     *
     * @param semester the value for TeaProof.semester
     *
     * @mbg.generated
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }
}