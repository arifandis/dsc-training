package com.xavier.dsc_training.Pojo;

public class Employee {
    String mNama,mPosition,mCompany;

    public Employee(String mNama, String mPosition, String mCompany) {
        this.mNama = mNama;
        this.mPosition = mPosition;
        this.mCompany = mCompany;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmPosition() {
        return mPosition;
    }

    public void setmPosition(String mPosition) {
        this.mPosition = mPosition;
    }

    public String getmCompany() {
        return mCompany;
    }

    public void setmCompany(String mCompany) {
        this.mCompany = mCompany;
    }
}
