package com.ifeng.bigdata.entity;

import java.util.Date;

/**
 * Create by chang at 2017/9/9 上午11:20.
 */
public class HealthStatus {
    public enum Status {
        SUCCESS, FAIL;
    }

    private Status status;
    private long timeStamp;
    private String dateTime;
    private String detail;

    public HealthStatus() {
        Date date = new Date();
        this.timeStamp = date.getTime();
        this.dateTime = date.toString();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

/*    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }*/

    public String getDateTime() {
        return dateTime;
    }

   /* public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }*/

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
