package com.javabill0cypher.patterns.memento.model;

public class Payment implements Operation {
    private String operationID;
    private String operationName;
    private Double sum;

    public Payment(String operationID, String operationName, Double sum) {
        this.operationID = operationID;
        this.operationName = operationName;
        this.sum = sum;
    }

    @Override
    public Operation getState() {
        return this;
    }

    @Override
    public Double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "operationID='" + operationID + '\'' +
                ", operationName='" + operationName + '\'' +
                ", sum=" + sum +
                '}';
    }
}
