package com.example.lolaabudu.json;

import java.util.List;

public class PuppyResponse {
    public String status;
    public List<String> messasge;

    public PuppyResponse(String status, List<String> message){
        this.status=status;
        this.messasge=message;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getMessasge() {
        return messasge;
    }

    public void setStatus(String status) {
        this.status=status;
    }

    public void setMessasge(List<String> message) {
        this.messasge=message;
    }
}
