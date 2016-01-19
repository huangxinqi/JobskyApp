package edu.csu.bean;

import javax.persistence.*;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "DemandInfo", schema = "dbo", catalog = "jobskynet8")
public class DemandInfoBean {
    private int demandId;
    private String positionName;
    private String educationalLevel;
    private String major;
    private Integer demandNum;
    private String positionDec;

    @Id
    @Column(name = "DemandID", nullable = false)
    public int getDemandId() {
        return demandId;
    }

    public void setDemandId(int demandId) {
        this.demandId = demandId;
    }

    @Basic
    @Column(name = "PositionName", nullable = true, length = 100)
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Basic
    @Column(name = "EducationalLevel", nullable = true, length = 20)
    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    @Basic
    @Column(name = "Major", nullable = true, length = 2147483647)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "DemandNum", nullable = true)
    public Integer getDemandNum() {
        return demandNum;
    }

    public void setDemandNum(Integer demandNum) {
        this.demandNum = demandNum;
    }

    @Basic
    @Column(name = "PositionDec", nullable = true, length = 2147483647)
    public String getPositionDec() {
        return positionDec;
    }

    public void setPositionDec(String positionDec) {
        this.positionDec = positionDec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DemandInfoBean that = (DemandInfoBean) o;

        if (demandId != that.demandId) return false;
        if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null) return false;
        if (educationalLevel != null ? !educationalLevel.equals(that.educationalLevel) : that.educationalLevel != null)
            return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (demandNum != null ? !demandNum.equals(that.demandNum) : that.demandNum != null) return false;
        if (positionDec != null ? !positionDec.equals(that.positionDec) : that.positionDec != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = demandId;
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        result = 31 * result + (educationalLevel != null ? educationalLevel.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (demandNum != null ? demandNum.hashCode() : 0);
        result = 31 * result + (positionDec != null ? positionDec.hashCode() : 0);
        return result;
    }
}
