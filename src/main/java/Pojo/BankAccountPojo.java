package Pojo;

public class BankAccountPojo {

        private String bankNumber;
        private String accountNumber;
        private String bankBranchNumber;
        private String variation;
        private String type;
        private boolean isJuristic;

        public String getBankNumber() {
            return bankNumber;
        }

        public void setBankNumber(String bankNumber) {
            this.bankNumber = bankNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getBankBranchNumber() {
            return bankBranchNumber;
        }

        public void setBankBranchNumber(String bankBranchNumber) {
            this.bankBranchNumber = bankBranchNumber;
        }

        public String getVariation() {
            return variation;
        }

        public void setVariation(String variation) {
            this.variation = variation;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isIsJuristic() {
            return isJuristic;
        }

        public void setIsJuristic(boolean isJuristic) {
            this.isJuristic = isJuristic;
        }
    }

