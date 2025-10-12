package framework;

public class ShopAcc {

    // Fields
    protected int accNo;
    protected String accNm;
    protected float charges;

    // Constructor
    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    // Method to be overridden by subclasses
    public void bookProduct(float charges) {
        // Implementation will be provided in child classes
    }

    // Method to display items or charges
    public void items(float charges) {
        // Implementation will be provided in child classes
    }

    // toString method
    @Override
    public String toString() {
        return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
    }
}
