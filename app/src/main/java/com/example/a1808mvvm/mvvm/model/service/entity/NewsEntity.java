package com.example.a1808mvvm.mvvm.model.service.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.example.net.BaseRespEntify;
import com.example.net.entity.BaseEntity;

import java.util.List;
public class NewsEntity extends BaseEntity<NewsEntity> implements MultiItemEntity {

    public NewsEntity(){
        super();
    }

    private int id;
    private String newscode;
    private int newstypeid;
    private int sourcesiteid;
    private String sourcesitename;
    private String title;
    private String description;
    private String auth;
    private String sourceurl;
    private String mainimgurl;
    private String istop;

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

    public int getNewstypeid() {
        return newstypeid;
    }

    public void setNewstypeid(int newstypeid) {
        this.newstypeid = newstypeid;
    }

    public int getSourcesiteid() {
        return sourcesiteid;
    }

    public void setSourcesiteid(int sourcesiteid) {
        this.sourcesiteid = sourcesiteid;
    }

    public String getSourcesitename() {
        return sourcesitename;
    }

    public void setSourcesitename(String sourcesitename) {
        this.sourcesitename = sourcesitename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
    }

    public String getMainimgurl() {
        return mainimgurl;
    }

    public void setMainimgurl(String mainimgurl) {
        this.mainimgurl = mainimgurl;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    @Override
    public int getItemType() {
        return id % 2;
    }
}
