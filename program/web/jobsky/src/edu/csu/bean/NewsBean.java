package edu.csu.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "News", schema = "dbo", catalog = "jobskynet8")
public class NewsBean {
    private int newsId;
    private String title;
    private String content;
    private Timestamp newsTime;
    private String editor;
    private int clickTimes;
    private String fileAddr;

    @Id
    @Column(name = "NewsID", nullable = false)
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
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
    @Column(name = "Content", nullable = false, length = 2147483647)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "NewsTime", nullable = false)
    public Timestamp getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Timestamp newsTime) {
        this.newsTime = newsTime;
    }

    @Basic
    @Column(name = "Editor", nullable = true, length = 50)
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Basic
    @Column(name = "ClickTimes", nullable = false)
    public int getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(int clickTimes) {
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

        NewsBean newsBean = (NewsBean) o;

        if (newsId != newsBean.newsId) return false;
        if (clickTimes != newsBean.clickTimes) return false;
        if (title != null ? !title.equals(newsBean.title) : newsBean.title != null) return false;
        if (content != null ? !content.equals(newsBean.content) : newsBean.content != null) return false;
        if (newsTime != null ? !newsTime.equals(newsBean.newsTime) : newsBean.newsTime != null) return false;
        if (editor != null ? !editor.equals(newsBean.editor) : newsBean.editor != null) return false;
        if (fileAddr != null ? !fileAddr.equals(newsBean.fileAddr) : newsBean.fileAddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = newsId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (newsTime != null ? newsTime.hashCode() : 0);
        result = 31 * result + (editor != null ? editor.hashCode() : 0);
        result = 31 * result + clickTimes;
        result = 31 * result + (fileAddr != null ? fileAddr.hashCode() : 0);
        return result;
    }
}
