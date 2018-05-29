package com.xavier.dsc_training.Pojo;

public class Company {
    String mNameCompany, mAddress;

    public Company(String mNameCompany, String mAddress) {
        this.mNameCompany = mNameCompany;
        this.mAddress = mAddress;
    }

    public String getmNameCompany() {
        return mNameCompany;
    }

    public void setmNameCompany(String mNameCompany) {
        this.mNameCompany = mNameCompany;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}
