package com.oocl.frm.userprofile.webservice.DTO;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(
        name = "UserProfile",
        namespace = "http://com.oocl.frm.userprofile"
)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "UserProfile",
        namespace = "http://com.oocl.frm.userprofile",
        propOrder = {"city", "company", "country", "department", "email", "emailBanner", "faxNumber", "firstName", "gender", "group", "ipPhone", "isActive", "jobTitle", "lastName", "middleName", "mobilePhone", "officeCode", "phone", "profileId", "regionGroup", "section1", "section2", "section3", "sourceLdap", "subRegion", "timezone", "userId", "regionalFirstName", "regionalMiddleName", "regionalLastName", "joinDate", "globalStaffId"}
)
public class UserProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(
            name = "City",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String city;
    @XmlElement(
            name = "Company",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String company;
    @XmlElement(
            name = "Country",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String country;
    @XmlElement(
            name = "Department",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String department;
    @XmlElement(
            name = "Email",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String email;
    @XmlElement(
            name = "EmailBanner",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String emailBanner;
    @XmlElement(
            name = "FaxNumber",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String faxNumber;
    @XmlElement(
            name = "FirstName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String firstName;
    @XmlElement(
            name = "Gender",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String gender;
    @XmlElement(
            name = "Group",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String group;
    @XmlElement(
            name = "IpPhone",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String ipPhone;
    @XmlElement(
            name = "IsActive",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private boolean isActive;
    @XmlElement(
            name = "JobTitle",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String jobTitle;
    @XmlElement(
            name = "LastName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String lastName;
    @XmlElement(
            name = "MiddleName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String middleName;
    @XmlElement(
            name = "MobilePhone",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String mobilePhone;
    @XmlElement(
            name = "OfficeCode",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String officeCode;
    @XmlElement(
            name = "Phone",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String phone;
    @XmlElement(
            name = "ProfileId",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private long profileId;
    @XmlElement(
            name = "RegionGroup",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String regionGroup;
    @XmlElement(
            name = "Section1",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String section1;
    @XmlElement(
            name = "Section2",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String section2;
    @XmlElement(
            name = "Section3",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String section3;
    @XmlElement(
            name = "SourceLdap",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String sourceLdap;
    @XmlElement(
            name = "SubRegion",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String subRegion;
    @XmlElement(
            name = "Timezone",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String timezone;
    @XmlElement(
            name = "UserId",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String userId;
    @XmlElement(
            name = "RegionalFirstName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String regionalFirstName;
    @XmlElement(
            name = "RegionalMiddleName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String regionalMiddleName;
    @XmlElement(
            name = "RegionalLastName",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String regionalLastName;
    @XmlElement(
            name = "JoinDate",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String joinDate;
    @XmlElement(
            name = "GlobalStaffId",
            namespace = "http://com.oocl.frm.userprofile",
            required = true,
            nillable = false
    )
    private String globalStaffId;

    public UserProfile() {
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailBanner() {
        return this.emailBanner;
    }

    public void setEmailBanner(String emailBanner) {
        this.emailBanner = emailBanner;
    }

    public String getFaxNumber() {
        return this.faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIpPhone() {
        return this.ipPhone;
    }

    public void setIpPhone(String ipPhone) {
        this.ipPhone = ipPhone;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getProfileId() {
        return this.profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getRegionGroup() {
        return this.regionGroup;
    }

    public void setRegionGroup(String regionGroup) {
        this.regionGroup = regionGroup;
    }

    public String getSection1() {
        return this.section1;
    }

    public void setSection1(String section1) {
        this.section1 = section1;
    }

    public String getSection2() {
        return this.section2;
    }

    public void setSection2(String section2) {
        this.section2 = section2;
    }

    public String getSection3() {
        return this.section3;
    }

    public void setSection3(String section3) {
        this.section3 = section3;
    }

    public String getSourceLdap() {
        return this.sourceLdap;
    }

    public void setSourceLdap(String sourceLdap) {
        this.sourceLdap = sourceLdap;
    }

    public String getSubRegion() {
        return this.subRegion;
    }

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRegionalFirstName() {
        return this.regionalFirstName;
    }

    public void setRegionalFirstName(String regionalFirstName) {
        this.regionalFirstName = regionalFirstName;
    }

    public String getRegionalMiddleName() {
        return this.regionalMiddleName;
    }

    public void setRegionalMiddleName(String regionalMiddleName) {
        this.regionalMiddleName = regionalMiddleName;
    }

    public String getRegionalLastName() {
        return this.regionalLastName;
    }

    public void setRegionalLastName(String regionalLastName) {
        this.regionalLastName = regionalLastName;
    }

    public String getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getGlobalStaffId() {
        return this.globalStaffId;
    }

    public void setGlobalStaffId(String globalStaffId) {
        this.globalStaffId = globalStaffId;
    }
}
