package com.example.demo.enity;

import java.util.Date;

public class LocalAuth {
    private Long longAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;

    public Long getLongAuthId() {
        return longAuthId;
    }

    public void setLongAuthId(Long longAuthId) {
        this.longAuthId = longAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
