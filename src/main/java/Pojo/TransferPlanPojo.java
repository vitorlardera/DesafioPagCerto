package Pojo;

public class TransferPlanPojo {

    private int days;
    private boolean anticipated;
    private int daysOnlineSplit;
    private boolean migrate;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isAnticipated() {
        return anticipated;
    }

    public void setAnticipated(boolean anticipated) {
        this.anticipated = anticipated;
    }

    public int getDaysOnlineSplit() {
        return daysOnlineSplit;
    }

    public void setDaysOnlineSplit(int daysOnlineSplit) {
        this.daysOnlineSplit = daysOnlineSplit;
    }

    public boolean isMigrate() {
        return migrate;
    }

    public void setMigrate(boolean migrate) {
        this.migrate = migrate;
    }
}
