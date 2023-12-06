package models;

import java.util.Date;

public class Payment  {
    private Payment_Mode payment_mode;
    private PaymentStatus paymentStatus;
    private int amount;
    private String ReferenceNumber;
    private Date TimeStamp;

    public Payment_Mode getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(Payment_Mode payment_mode) {
        this.payment_mode = payment_mode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReferenceNumber() {
        return ReferenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        ReferenceNumber = referenceNumber;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        TimeStamp = timeStamp;
    }
}
