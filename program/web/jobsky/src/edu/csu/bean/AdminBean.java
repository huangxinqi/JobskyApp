package edu.csu.bean;

import javax.persistence.*;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@Table(name = "Admin", schema = "dbo", catalog = "jobskynet8")
public class AdminBean {
    private int adminId;
    private String adminAccount;
    private String adminName;
    private String adminPwd;
    private int adminType;

    @Id
    @Column(name = "AdminID", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "AdminAccount", nullable = false, length = 20)
    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    @Basic
    @Column(name = "AdminName", nullable = false, length = 20)
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "AdminPwd", nullable = false, length = 50)
    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @Basic
    @Column(name = "AdminType", nullable = false)
    public int getAdminType() {
        return adminType;
    }

    public void setAdminType(int adminType) {
        this.adminType = adminType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminBean adminBean = (AdminBean) o;

        if (adminId != adminBean.adminId) return false;
        if (adminType != adminBean.adminType) return false;
        if (adminAccount != null ? !adminAccount.equals(adminBean.adminAccount) : adminBean.adminAccount != null)
            return false;
        if (adminName != null ? !adminName.equals(adminBean.adminName) : adminBean.adminName != null) return false;
        if (adminPwd != null ? !adminPwd.equals(adminBean.adminPwd) : adminBean.adminPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId;
        result = 31 * result + (adminAccount != null ? adminAccount.hashCode() : 0);
        result = 31 * result + (adminName != null ? adminName.hashCode() : 0);
        result = 31 * result + (adminPwd != null ? adminPwd.hashCode() : 0);
        result = 31 * result + adminType;
        return result;
    }
}
