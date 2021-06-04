package org.dryun.domain.entity;

import java.io.Serializable;

public class ClassIfy implements Serializable {
    private Integer id;
    private String classIfyId;
    private String classIfyName;
    private String classIfyState;

    public ClassIfy() {
    }

    public ClassIfy(Integer id, String classIfyId, String classIfyName, String classIfyState) {
        this.id = id;
        this.classIfyId = classIfyId;
        this.classIfyName = classIfyName;
        this.classIfyState = classIfyState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassIfyId() {
        return classIfyId;
    }

    public void setClassIfyId(String classIfyId) {
        this.classIfyId = classIfyId;
    }

    public String getClassIfyName() {
        return classIfyName;
    }

    public void setClassIfyName(String classIfyName) {
        this.classIfyName = classIfyName;
    }

    public String getClassIfyState() {
        return classIfyState;
    }

    public void setClassIfyState(String classIfyState) {
        this.classIfyState = classIfyState;
    }
}
