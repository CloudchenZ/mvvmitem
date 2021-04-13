package com.example.a1808mvvm.mvvm.model.service.entity;

public class FaBuEntity {

    /**
     * id : 1
     * newscode : sample string 2
     * userid : 3
     * content : sample string 4
     * imgs : sample string 5
     * ctime : sample string 6
     */

    private int id;
    private String newscode;
    private int userid;
    private String content;
    private String imgs;
    private String ctime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewscode() {
        return newscode;
    }

    public void setNewscode(String newscode) {
        this.newscode = newscode;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}
