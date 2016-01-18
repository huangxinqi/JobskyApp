package edu.csu.bean;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by huangxinqi on 2016/1/16.
 */
@Entity
@javax.persistence.Table(name = "Employer", schema = "dbo", catalog = "jobskynet8")
public class EmployerBean {
    private int employerId;

    @Id
    @javax.persistence.Column(name = "EmployerID", nullable = false)
    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    private String employerAccount;

    @Basic
    @javax.persistence.Column(name = "EmployerAccount", nullable = false, length = 50)
    public String getEmployerAccount() {
        return employerAccount;
    }

    public void setEmployerAccount(String employerAccount) {
        this.employerAccount = employerAccount;
    }

    private String employerPwd;

    @Basic
    @javax.persistence.Column(name = "EmployerPwd", nullable = false, length = 50)
    public String getEmployerPwd() {
        return employerPwd;
    }

    public void setEmployerPwd(String employerPwd) {
        this.employerPwd = employerPwd;
    }

    private String contactPersonName;

    @Basic
    @javax.persistence.Column(name = "ContactPersonName", nullable = false, length = 20)
    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    private short contactPersonSex;

    @Basic
    @javax.persistence.Column(name = "ContactPersonSex", nullable = false)
    public short getContactPersonSex() {
        return contactPersonSex;
    }

    public void setContactPersonSex(short contactPersonSex) {
        this.contactPersonSex = contactPersonSex;
    }

    private String fixedTelephone;

    @Basic
    @javax.persistence.Column(name = "FixedTelephone", nullable = true, length = 20)
    public String getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(String fixedTelephone) {
        this.fixedTelephone = fixedTelephone;
    }

    private String mobilePhone;

    @Basic
    @javax.persistence.Column(name = "MobilePhone", nullable = false, length = 20)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "Email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String companyName;

    @Basic
    @javax.persistence.Column(name = "CompanyName", nullable = false, length = 30)
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String parentCompanyName;

    @Basic
    @javax.persistence.Column(name = "ParentCompanyName", nullable = true, length = 30)
    public String getParentCompanyName() {
        return parentCompanyName;
    }

    public void setParentCompanyName(String parentCompanyName) {
        this.parentCompanyName = parentCompanyName;
    }

    private String companyIntroduction;

    @Basic
    @javax.persistence.Column(name = "CompanyIntroduction", nullable = true, length = 2147483647)
    public String getCompanyIntroduction() {
        return companyIntroduction;
    }

    public void setCompanyIntroduction(String companyIntroduction) {
        this.companyIntroduction = companyIntroduction;
    }

    private String companyPhone;

    @Basic
    @javax.persistence.Column(name = "CompanyPhone", nullable = false, length = 20)
    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    private String organizationCode;

    @Basic
    @javax.persistence.Column(name = "OrganizationCode", nullable = false, length = 20)
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    private Timestamp validPeriod;

    @Basic
    @javax.persistence.Column(name = "ValidPeriod", nullable = false)
    public Timestamp getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Timestamp validPeriod) {
        this.validPeriod = validPeriod;
    }

    private String companyNature;

    @Basic
    @javax.persistence.Column(name = "CompanyNature", nullable = false, length = 50)
    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    private String companyBusiness;

    @Basic
    @javax.persistence.Column(name = "CompanyBusiness", nullable = false, length = 50)
    public String getCompanyBusiness() {
        return companyBusiness;
    }

    public void setCompanyBusiness(String companyBusiness) {
        this.companyBusiness = companyBusiness;
    }

    private String companySize;

    @Basic
    @javax.persistence.Column(name = "CompanySize", nullable = false, length = 20)
    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    private BigDecimal registeredCapital;

    @Basic
    @javax.persistence.Column(name = "RegisteredCapital", nullable = false, precision = 2)
    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    private int isTop500;

    @Basic
    @javax.persistence.Column(name = "IsTop500", nullable = false)
    public int getIsTop500() {
        return isTop500;
    }

    public void setIsTop500(int isTop500) {
        this.isTop500 = isTop500;
    }

    private String companyAreaProvince;

    @Basic
    @javax.persistence.Column(name = "CompanyAreaProvince", nullable = false, length = 30)
    public String getCompanyAreaProvince() {
        return companyAreaProvince;
    }

    public void setCompanyAreaProvince(String companyAreaProvince) {
        this.companyAreaProvince = companyAreaProvince;
    }

    private String companyAreaCity;

    @Basic
    @javax.persistence.Column(name = "CompanyAreaCity", nullable = false, length = 30)
    public String getCompanyAreaCity() {
        return companyAreaCity;
    }

    public void setCompanyAreaCity(String companyAreaCity) {
        this.companyAreaCity = companyAreaCity;
    }

    private String companyAddress;

    @Basic
    @javax.persistence.Column(name = "CompanyAddress", nullable = false, length = 2147483647)
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    private String cityClass;

    @Basic
    @javax.persistence.Column(name = "CityClass", nullable = false, length = 20)
    public String getCityClass() {
        return cityClass;
    }

    public void setCityClass(String cityClass) {
        this.cityClass = cityClass;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "Remark", nullable = true, length = 2147483647)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String credentialsDir;

    @Basic
    @javax.persistence.Column(name = "CredentialsDir", nullable = false, length = 100)
    public String getCredentialsDir() {
        return credentialsDir;
    }

    public void setCredentialsDir(String credentialsDir) {
        this.credentialsDir = credentialsDir;
    }

    private Timestamp registerTime;

    @Basic
    @javax.persistence.Column(name = "RegisterTime", nullable = false)
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    private int isDelete;

    @Basic
    @javax.persistence.Column(name = "IsDelete", nullable = false)
    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployerBean that = (EmployerBean) o;

        if (employerId != that.employerId) return false;
        if (contactPersonSex != that.contactPersonSex) return false;
        if (isTop500 != that.isTop500) return false;
        if (isDelete != that.isDelete) return false;
        if (employerAccount != null ? !employerAccount.equals(that.employerAccount) : that.employerAccount != null)
            return false;
        if (employerPwd != null ? !employerPwd.equals(that.employerPwd) : that.employerPwd != null) return false;
        if (contactPersonName != null ? !contactPersonName.equals(that.contactPersonName) : that.contactPersonName != null)
            return false;
        if (fixedTelephone != null ? !fixedTelephone.equals(that.fixedTelephone) : that.fixedTelephone != null)
            return false;
        if (mobilePhone != null ? !mobilePhone.equals(that.mobilePhone) : that.mobilePhone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (parentCompanyName != null ? !parentCompanyName.equals(that.parentCompanyName) : that.parentCompanyName != null)
            return false;
        if (companyIntroduction != null ? !companyIntroduction.equals(that.companyIntroduction) : that.companyIntroduction != null)
            return false;
        if (companyPhone != null ? !companyPhone.equals(that.companyPhone) : that.companyPhone != null) return false;
        if (organizationCode != null ? !organizationCode.equals(that.organizationCode) : that.organizationCode != null)
            return false;
        if (validPeriod != null ? !validPeriod.equals(that.validPeriod) : that.validPeriod != null) return false;
        if (companyNature != null ? !companyNature.equals(that.companyNature) : that.companyNature != null)
            return false;
        if (companyBusiness != null ? !companyBusiness.equals(that.companyBusiness) : that.companyBusiness != null)
            return false;
        if (companySize != null ? !companySize.equals(that.companySize) : that.companySize != null) return false;
        if (registeredCapital != null ? !registeredCapital.equals(that.registeredCapital) : that.registeredCapital != null)
            return false;
        if (companyAreaProvince != null ? !companyAreaProvince.equals(that.companyAreaProvince) : that.companyAreaProvince != null)
            return false;
        if (companyAreaCity != null ? !companyAreaCity.equals(that.companyAreaCity) : that.companyAreaCity != null)
            return false;
        if (companyAddress != null ? !companyAddress.equals(that.companyAddress) : that.companyAddress != null)
            return false;
        if (cityClass != null ? !cityClass.equals(that.cityClass) : that.cityClass != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (credentialsDir != null ? !credentialsDir.equals(that.credentialsDir) : that.credentialsDir != null)
            return false;
        if (registerTime != null ? !registerTime.equals(that.registerTime) : that.registerTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employerId;
        result = 31 * result + (employerAccount != null ? employerAccount.hashCode() : 0);
        result = 31 * result + (employerPwd != null ? employerPwd.hashCode() : 0);
        result = 31 * result + (contactPersonName != null ? contactPersonName.hashCode() : 0);
        result = 31 * result + (int) contactPersonSex;
        result = 31 * result + (fixedTelephone != null ? fixedTelephone.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (parentCompanyName != null ? parentCompanyName.hashCode() : 0);
        result = 31 * result + (companyIntroduction != null ? companyIntroduction.hashCode() : 0);
        result = 31 * result + (companyPhone != null ? companyPhone.hashCode() : 0);
        result = 31 * result + (organizationCode != null ? organizationCode.hashCode() : 0);
        result = 31 * result + (validPeriod != null ? validPeriod.hashCode() : 0);
        result = 31 * result + (companyNature != null ? companyNature.hashCode() : 0);
        result = 31 * result + (companyBusiness != null ? companyBusiness.hashCode() : 0);
        result = 31 * result + (companySize != null ? companySize.hashCode() : 0);
        result = 31 * result + (registeredCapital != null ? registeredCapital.hashCode() : 0);
        result = 31 * result + isTop500;
        result = 31 * result + (companyAreaProvince != null ? companyAreaProvince.hashCode() : 0);
        result = 31 * result + (companyAreaCity != null ? companyAreaCity.hashCode() : 0);
        result = 31 * result + (companyAddress != null ? companyAddress.hashCode() : 0);
        result = 31 * result + (cityClass != null ? cityClass.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (credentialsDir != null ? credentialsDir.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + isDelete;
        return result;
    }
}
