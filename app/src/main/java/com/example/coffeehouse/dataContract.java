    package com.example.coffeehouse;

import android.provider.BaseColumns;

public class dataContract{
    String name,email,password;
    int phone;

    public dataContract(String name, int phone, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public dataContract() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
