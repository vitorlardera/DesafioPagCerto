package Pojo;

public class CompanyPojo {
    private String tradeName;
    private String fullName;
    private String taxDocument;
    private String businessTypeId;
    private double cnaeCode;
    private String foundationDate;

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTaxDocument() {
        return taxDocument;
    }

    public void setTaxDocument(String taxDocument) {
        this.taxDocument = taxDocument;
    }

    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public double getCnaeCode() {
        return cnaeCode;
    }

    public void setCnaeCode(double cnaeCode) {
        this.cnaeCode = cnaeCode;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }
}
