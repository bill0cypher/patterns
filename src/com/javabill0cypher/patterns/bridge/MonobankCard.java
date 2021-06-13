package com.javabill0cypher.patterns.bridge;

public class MonobankCard implements Card{
    private int balance;
    private int depositBalance;
    private int creditBalance;
    private boolean regularPayments;
    private boolean depositAllowed;

    public MonobankCard(int balance, int creditBalance) {
        this.balance = balance;
        this.creditBalance = creditBalance;
        this.regularPayments = false;
        this.depositAllowed = false;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setCreditBalance(int creditSum) {
        this.creditBalance = creditSum;
    }

    @Override
    public void setDeposit(boolean enable) {
        this.depositAllowed = enable;
    }

    @Override
    public boolean depositEnabled() {
        return this.depositAllowed;
    }

    @Override
    public void chargeDeposit(int sum) {
        if (depositAllowed) {
            depositBalance += sum;
            System.out.println("Deposit charged. Your deposit balance is " + depositBalance);
        }
        else
            System.out.println("Deposit func is disabled for your card");
    }

    @Override
    public void setRegularPayments(boolean enable) {
        this.regularPayments = enable;
    }

    @Override
    public boolean regularsEnabled() {
        return this.regularPayments;
    }

    @Override
    public void chargeCard(int sum) {
        balance +=sum;
        System.out.println("Your card charged with " + sum + ". Your balance is " + balance);
    }

    @Override
    public void withdrawMoney(int sum) {
        balance -=sum;
        System.out.println("Your balance is " + balance);
    }
}
