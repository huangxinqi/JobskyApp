package edu.csu.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "TempArticle", schema = "dbo", catalog = "jobskynet8")
public class TempArticleBean {
    private int tempArticleId;
    private Integer articleId;
    private String title;
    private String introduction;
    private Integer placeSecondId;
    private Timestamp editTime;
    private String editorAccount;
    private String contactInfo;
    private String fileAddr;
    private String articleDescription;
    private String auditInfo;
    private Integer bigArticleId;
    private Integer isAudit;
    private Timestamp recruitTime;
    private String recruitPlace;
    private Integer placeFirstId;

    @Id
    @Column(name = "TempArticleID", nullable = false)
    public int getTempArticleId() {
        return tempArticleId;
    }

    public void setTempArticleId(int tempArticleId) {
        this.tempArticleId = tempArticleId;
    }

    @Basic
    @Column(name = "ArticleID", nullable = true)
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "Title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Introduction", nullable = true, length = 2147483647)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "PlaceSecondID", nullable = true)
    public Integer getPlaceSecondId() {
        return placeSecondId;
    }

    public void setPlaceSecondId(Integer placeSecondId) {
        this.placeSecondId = placeSecondId;
    }

    @Basic
    @Column(name = "EditTime", nullable = true)
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "EditorAccount", nullable = true, length = 50)
    public String getEditorAccount() {
        return editorAccount;
    }

    public void setEditorAccount(String editorAccount) {
        this.editorAccount = editorAccount;
    }

    @Basic
    @Column(name = "ContactInfo", nullable = true, length = 2147483647)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Basic
    @Column(name = "FileAddr", nullable = true, length = 100)
    public String getFileAddr() {
        return fileAddr;
    }

    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
    }

    @Basic
    @Column(name = "ArticleDescription", nullable = true, length = 2147483647)
    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    @Basic
    @Column(name = "AuditInfo", nullable = true, length = 2147483647)
    public String getAuditInfo() {
        return auditInfo;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }

    @Basic
    @Column(name = "BigArticleID", nullable = true)
    public Integer getBigArticleId() {
        return bigArticleId;
    }

    public void setBigArticleId(Integer bigArticleId) {
        this.bigArticleId = bigArticleId;
    }

    @Basic
    @Column(name = "IsAudit", nullable = true)
    public Integer getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Integer isAudit) {
        this.isAudit = isAudit;
    }

    @Basic
    @Column(name = "RecruitTime", nullable = true)
    public Timestamp getRecruitTime() {
        return recruitTime;
    }

    public void setRecruitTime(Timestamp recruitTime) {
        this.recruitTime = recruitTime;
    }

    @Basic
    @Column(name = "RecruitPlace", nullable = true, length = 20)
    public String getRecruitPlace() {
        return recruitPlace;
    }

    public void setRecruitPlace(String recruitPlace) {
        this.recruitPlace = recruitPlace;
    }

    @Basic
    @Column(name = "PlaceFirstID", nullable = true)
    public Integer getPlaceFirstId() {
        return placeFirstId;
    }

    public void setPlaceFirstId(Integer placeFirstId) {
        this.placeFirstId = placeFirstId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TempArticleBean that = (TempArticleBean) o;

        if (tempArticleId != that.tempArticleId) return false;
        if (articleId != null ? !articleId.equals(that.articleId) : that.articleId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
        if (placeSecondId != null ? !placeSecondId.equals(that.placeSecondId) : that.placeSecondId != null)
            return false;
        if (editTime != null ? !editTime.equals(that.editTime) : that.editTime != null) return false;
        if (editorAccount != null ? !editorAccount.equals(that.editorAccount) : that.editorAccount != null)
            return false;
        if (contactInfo != null ? !contactInfo.equals(that.contactInfo) : that.contactInfo != null) return false;
        if (fileAddr != null ? !fileAddr.equals(that.fileAddr) : that.fileAddr != null) return false;
        if (articleDescription != null ? !articleDescription.equals(that.articleDescription) : that.articleDescription != null)
            return false;
        if (auditInfo != null ? !auditInfo.equals(that.auditInfo) : that.auditInfo != null) return false;
        if (bigArticleId != null ? !bigArticleId.equals(that.bigArticleId) : that.bigArticleId != null) return false;
        if (isAudit != null ? !isAudit.equals(that.isAudit) : that.isAudit != null) return false;
        if (recruitTime != null ? !recruitTime.equals(that.recruitTime) : that.recruitTime != null) return false;
        if (recruitPlace != null ? !recruitPlace.equals(that.recruitPlace) : that.recruitPlace != null) return false;
        if (placeFirstId != null ? !placeFirstId.equals(that.placeFirstId) : that.placeFirstId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tempArticleId;
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (placeSecondId != null ? placeSecondId.hashCode() : 0);
        result = 31 * result + (editTime != null ? editTime.hashCode() : 0);
        result = 31 * result + (editorAccount != null ? editorAccount.hashCode() : 0);
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (fileAddr != null ? fileAddr.hashCode() : 0);
        result = 31 * result + (articleDescription != null ? articleDescription.hashCode() : 0);
        result = 31 * result + (auditInfo != null ? auditInfo.hashCode() : 0);
        result = 31 * result + (bigArticleId != null ? bigArticleId.hashCode() : 0);
        result = 31 * result + (isAudit != null ? isAudit.hashCode() : 0);
        result = 31 * result + (recruitTime != null ? recruitTime.hashCode() : 0);
        result = 31 * result + (recruitPlace != null ? recruitPlace.hashCode() : 0);
        result = 31 * result + (placeFirstId != null ? placeFirstId.hashCode() : 0);
        return result;
    }
}
