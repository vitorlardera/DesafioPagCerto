package Pojo;

import java.util.List;

public class HolderPojo {

    private String fullName;
    private String mothersName;
    private String birthDate;
    private String gender;
    private String taxDocument;
    private String phone;
    private String mobile;
    private String jobTitle;
    private CompanyPojo company;
    private ContactPojo contact;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTaxDocument() {
        return taxDocument;
    }

    public void setTaxDocument(String taxDocument) {
        this.taxDocument = taxDocument;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public CompanyPojo getCompany() {
        return company;
    }

    public void setCompany(CompanyPojo company) {
        this.company = company;
    }

    public ContactPojo getContact() {
        return contact;
    }

    public void setContact(ContactPojo contact) {
        this.contact = contact;
    }
}