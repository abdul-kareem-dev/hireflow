package com.kareem.hireflow;

public class Job {
    private int id;
    private String title;
    private String company;
    private String location;

    public int getId(){
        return id;
    }

    void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public String getCompany(){
        return company;
    }

    void setCompany(String company){

        this.company = company;
    }

    public String getLocation(){ return location;}

    void setLocation(String location){
        this.location = location;
    }

}
