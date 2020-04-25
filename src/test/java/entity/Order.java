package entity;

/**
 * Created by user on 22.10.2019.
 */
public class Order {
    private String countInstance;
    private String classVM;
    private String typeInstance;
    private String localSSD;
    private String region;
    private String commitmentTerm;
    private String amountRent;

    public Order(String countInstance, String classVM, String typeInstance, String localSSD, String region, String commitmentTerm, String amountRent) {
        this.countInstance = countInstance;
        this.classVM = classVM;
        this.typeInstance = typeInstance;
        this.localSSD = localSSD;
        this.region = region;
        this.commitmentTerm = commitmentTerm;
        this.amountRent = amountRent;
    }

    public String getCountInstance() {
        return countInstance;
    }

    public void setCountInstance(String countInstance) {
        this.countInstance = countInstance;
    }

    public String getClassVM() {
        return classVM;
    }

    public void setClassVM(String classVM) {
        this.classVM = classVM;
    }

    public String getTypeInstance() {
        return typeInstance;
    }

    public void setTypeInstance(String typeInstance) {
        this.typeInstance = typeInstance;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCommitmentTerm() {
        return commitmentTerm;
    }

    public void setCommitmentTerm(String commitmentTerm) {
        this.commitmentTerm = commitmentTerm;
    }

    public String getAmountRent() {
        return amountRent;
    }

    public void setAmountRent(String amountRent) {
        this.amountRent = amountRent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (getCountInstance() != null ? !getCountInstance().equals(order.getCountInstance()) : order.getCountInstance() != null)
            return false;
        if (getClassVM() != null ? !getClassVM().equals(order.getClassVM()) : order.getClassVM() != null) return false;
        if (getTypeInstance() != null ? !getTypeInstance().equals(order.getTypeInstance()) : order.getTypeInstance() != null)
            return false;
        if (getLocalSSD() != null ? !getLocalSSD().equals(order.getLocalSSD()) : order.getLocalSSD() != null)
            return false;
        if (getRegion() != null ? !getRegion().equals(order.getRegion()) : order.getRegion() != null) return false;
        if (getCommitmentTerm() != null ? !getCommitmentTerm().equals(order.getCommitmentTerm()) : order.getCommitmentTerm() != null)
            return false;
        return getAmountRent() != null ? getAmountRent().equals(order.getAmountRent()) : order.getAmountRent() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountInstance() != null ? getCountInstance().hashCode() : 0;
        result = 31 * result + (getClassVM() != null ? getClassVM().hashCode() : 0);
        result = 31 * result + (getTypeInstance() != null ? getTypeInstance().hashCode() : 0);
        result = 31 * result + (getLocalSSD() != null ? getLocalSSD().hashCode() : 0);
        result = 31 * result + (getRegion() != null ? getRegion().hashCode() : 0);
        result = 31 * result + (getCommitmentTerm() != null ? getCommitmentTerm().hashCode() : 0);
        result = 31 * result + (getAmountRent() != null ? getAmountRent().hashCode() : 0);
        return result;
    }
}
