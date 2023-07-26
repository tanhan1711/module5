package CaseStudy.model;

public class Contract {
    private int idContract;
    private int idBooking;
    private int deposit;
    private int paymentMoney;
    private int idCus;

    public Contract(int idContract, int idBooking, int deposit, int paymentMoney, int idCus) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.paymentMoney = paymentMoney;
        this.idCus = idCus;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(int paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", paymentMoney=" + paymentMoney +
                ", idCus=" + idCus +
                '}';
    }
}
