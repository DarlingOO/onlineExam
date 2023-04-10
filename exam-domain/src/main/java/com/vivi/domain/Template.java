package com.vivi.domain;

import java.util.Date;

public class Template {
    private Integer id;

    private String name;

    private String type;

    private String singleChoiceQuestion;

    private String multipleChoiceQuestion;

    private String tfQuestion;

    private String completion;

    private String comprehensiveQuestion;

    private Integer totalScore;

    private String status;

    private Long tid;

    private Date createTime;

    private Date updateTime;

    private String yl1;

    private String yl2;

    private String yl3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSingleChoiceQuestion() {
        return singleChoiceQuestion;
    }

    public void setSingleChoiceQuestion(String singleChoiceQuestion) {
        this.singleChoiceQuestion = singleChoiceQuestion == null ? null : singleChoiceQuestion.trim();
    }

    public String getMultipleChoiceQuestion() {
        return multipleChoiceQuestion;
    }

    public void setMultipleChoiceQuestion(String multipleChoiceQuestion) {
        this.multipleChoiceQuestion = multipleChoiceQuestion == null ? null : multipleChoiceQuestion.trim();
    }

    public String getTfQuestion() {
        return tfQuestion;
    }

    public void setTfQuestion(String tfQuestion) {
        this.tfQuestion = tfQuestion == null ? null : tfQuestion.trim();
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion == null ? null : completion.trim();
    }

    public String getComprehensiveQuestion() {
        return comprehensiveQuestion;
    }

    public void setComprehensiveQuestion(String comprehensiveQuestion) {
        this.comprehensiveQuestion = comprehensiveQuestion == null ? null : comprehensiveQuestion.trim();
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
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