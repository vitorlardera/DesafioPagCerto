package Pojo;

import java.util.List;

public class RequestPojo {

    private HolderPojo holder;
    private AddressPojo address;
    private BankAccountPojo bankAccount;
    private UserPojo user;
    private String businessActivityId;
    private String marketingMediaId;
    private TransferPlanPojo transferPlan;
    private String commercialName;
    private String appUrl;

    public HolderPojo getHolder() {
        return holder;
    }

    public void setHolder(HolderPojo holder) {
        this.holder = holder;
    }

    public AddressPojo getAddress() {
        return address;
    }

    public void setAddress(AddressPojo address) {
        this.address = address;
    }

    public BankAccountPojo getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccountPojo bankAccount) {
        this.bankAccount = bankAccount;
    }

    public UserPojo getUser() {
        return user;
    }

    public void setUser(UserPojo user) {
        this.user = user;
    }

    public String getBusinessActivityId() {
        return businessActivityId;
    }

    public void setBusinessActivityId(String businessActivityId) {
        this.businessActivityId = businessActivityId;
    }

    public String getMarketingMediaId() {
        return marketingMediaId;
    }

    public void setMarketingMediaId(String marketingMediaId) {
        this.marketingMediaId = marketingMediaId;
    }

    public TransferPlanPojo getTransferPlan() {
        return transferPlan;
    }

    public void setTransferPlan(TransferPlanPojo transferPlan) {
        this.transferPlan = transferPlan;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;


    }
}