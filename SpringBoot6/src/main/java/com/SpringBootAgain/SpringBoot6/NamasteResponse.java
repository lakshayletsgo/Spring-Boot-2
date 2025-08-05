package com.SpringBootAgain.SpringBoot6;

public class NamasteResponse {
    private String message;
    public NamasteResponse(String message){
        this.message = message;
    }
    public String getMessage(){return message;}
    public void setMessage(String message){this.message = message;}
}
