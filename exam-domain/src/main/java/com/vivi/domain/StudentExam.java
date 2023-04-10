package com.vivi.domain;

import java.util.Date;

public class StudentExam {
    private Long examId;

    private Long studentId;

    private String examGroup;

    private String question1;

    private String question2;

    private String question3;

    private String question4;

    private String question5;

    private String review4;

    private String review5;

    private Integer totalScore;

    private String paperPath;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String yl1;

    private String yl2;

    private String yl3;

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getExamGroup() {
        return examGroup;
    }

    public void setExamGroup(String examGroup) {
        this.examGroup = examGroup == null ? null : examGroup.trim();
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1 == null ? null : question1.trim();
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2 == null ? null : question2.trim();
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3 == null ? null : question3.trim();
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4 == null ? null : question4.trim();
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5 == null ? null : question5.trim();
    }

    public String getReview4() {
        return review4;
    }

    public void setReview4(String review4) {
        this.review4 = review4 == null ? null : review4.trim();
    }

    public String getReview5() {
        return review5;
    }

    public void setReview5(String review5) {
        this.review5 = review5 == null ? null : review5.trim();
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getPaperPath() {
        return paperPath;
    }

    public void setPaperPath(String paperPath) {
        this.paperPath = paperPath == null ? null : paperPath.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getYl1() {
        return yl1;
    }

    public void setYl1(String yl1) {
        this.yl1 = yl1 == null ? null : yl1.trim();
    }

    public String getYl2() {
        return yl2;
    }

    public void setYl2(String yl2) {
        this.yl2 = yl2 == null ? null : yl2.trim();
    }

    public String getYl3() {
        return yl3;
    }

    public void setYl3(String yl3) {
        this.yl3 = yl3 == null ? null : yl3.trim();
    }
}