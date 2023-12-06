package models;

import java.util.Date;
import java.util.List;

public class Bill {
    private Ticket ticket;
    private Date Exit_time;
    private double amount;
    private BillStatus billStatus;
    List<Payment> payments;
    private Gate gate;
    private Operator operator;
    private FeeCalculatorStrategyType feeCalculatorStrategyType;


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExit_time() {
        return Exit_time;
    }

    public void setExit_time(Date exit_time) {
        Exit_time = exit_time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public FeeCalculatorStrategyType getFeeCalculatorStrategyType() {
        return feeCalculatorStrategyType;
    }

    public void setFeeCalculatorStrategyType(FeeCalculatorStrategyType feeCalculatorStrategyType) {
        this.feeCalculatorStrategyType = feeCalculatorStrategyType;
    }
}
