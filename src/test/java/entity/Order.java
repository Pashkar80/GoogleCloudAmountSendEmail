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


}
