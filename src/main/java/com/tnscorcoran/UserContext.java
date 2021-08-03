package com.tnscorcoran;

public class UserContext {

    private String apiType, bankid, userid, name, status;
 
    public UserContext(String apiType, String bankid, String userid, String name, String status) {
        this.apiType = apiType;
        this.bankid = bankid;
        this.userid = userid;
        this.name = name;
        this.status = status;
        
    }

    public String getApiType() {
        return this.apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }


    public String getBankid() {
        return this.bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
