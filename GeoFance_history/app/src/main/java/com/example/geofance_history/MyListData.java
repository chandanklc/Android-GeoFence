package com.example.geofance_history;

public class MyListData {
    private String breach, date_time, status;
    private  int next;

    public MyListData(String breach, String date_time, String status, int next) {
        this.breach = breach;
        this.date_time = date_time;
        this.status = status;
        this.next = next;
    }

    public String getBreach() {
        return breach;
    }

    public void setBreach(String breach) {
        this.breach = breach;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
