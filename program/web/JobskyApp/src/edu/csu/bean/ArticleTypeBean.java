package edu.csu.bean;

import javax.persistence.*;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "ArticleType", schema = "dbo", catalog = "jobskynet8")
public class ArticleTypeBean {
    private int typeId;
    private String typeName;

    @Id
    @Column(name = "TypeID", nullable = false)
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "TypeName", nullable = false, length = 20)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleTypeBean that = (ArticleTypeBean) o;

        if (typeId != that.typeId) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
