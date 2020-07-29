package com.example.recyclerview;

public class MyListData {
    private String name, connect, code;

    public MyListData(String name, String connect, String code) {
        this.name = name;
        this.connect = connect;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
