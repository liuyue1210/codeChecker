package com.liuyue.model;

public class resultParameter {

    private double totalGrade;  // total grade
    private String pylint;      // result of pylint
    private int slc;            // source line of code
    // so on

    public double getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(double totalGrade) {
        this.totalGrade = totalGrade;
    }

    public String getPylint() {
        return pylint;
    }

    public void setPylint(String pylint) {
        this.pylint = pylint;
    }

    public int getSlc() {
        return slc;
    }

    public void setSlc(int slc) {
        this.slc = slc;
    }
}
