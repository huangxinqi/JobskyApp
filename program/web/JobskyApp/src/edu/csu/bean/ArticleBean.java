package edu.csu.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "Article", schema = "dbo", catalog = "jobskynet8")
public class ArticleBean {
    private int articleId;
    private String title;
    private String introduction;
    private Timestamp editTime;
    private String editorAccount;
    private String contactInfo;
    private Integer clickTimes;
    private String fileAddr;

    @Id
    @Column(name = "ArticleID", nullable = false)
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "Title", nullable = false, length = 100)
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
    @Column(name = "EditTime", nullable = false)
    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    @Basic
    @Column(name = "EditorAccount", nullable = false, length = 50)
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
    @Column(name = "ClickTimes", nullable = true)
    public Integer getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Integer clickTimes) {
        this.clickTimes = clickTimes;
    }

    @Basic
    @Column(name = "FileAddr", nullable = true, length = 100)
    public String getFileAddr() {
        return fileAddr;
    }

    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleBean that = (ArticleBean) o;

        if (articleId != that.articleId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
        if (editTime != null ? !editTime.equals(that.editTime) : that.editTime != null) return false;
        if (editorAccount != null ? !editorAccount.equals(that.editorAccount) : that.editorAccount != null)
            return false;
        if (contactInfo != null ? !contactInfo.equals(that.contactInfo) : that.contactInfo != null) return false;
        if (clickTimes != null ? !clickTimes.equals(that.clickTimes) : that.clickTimes != null) return false;
        if (fileAddr != null ? !fileAddr.equals(that.fileAddr) : that.fileAddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (editTime != null ? editTime.hashCode() : 0);
        result = 31 * result + (editorAccount != null ? editorAccount.hashCode() : 0);
        result = 31 * result + (contactInfo != null ? contactInfo.hashCode() : 0);
        result = 31 * result + (clickTimes != null ? clickTimes.hashCode() : 0);
        result = 31 * result + (fileAddr != null ? fileAddr.hashCode() : 0);
        return result;
    }
}
