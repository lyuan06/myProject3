package com.atguigu.team.service;

public class TeamException extends Exception {
    static final long serialVersionUID = -338751624229948L;

    public TeamException(){

    }

    public TeamException(String msg){
        super(msg);
    }
}
