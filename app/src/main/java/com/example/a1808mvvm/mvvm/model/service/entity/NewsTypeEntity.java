package com.example.a1808mvvm.mvvm.model.service.entity;

import java.util.List;

public class NewsTypeEntity {

    /**
     * code : 200
     * data : [{"id":1,"typename":"游戏"},{"id":2,"typename":"娱乐"},{"id":3,"typename":"体育"},{"id":4,"typename":"汽车"},{"id":5,"typename":"财经"},{"id":6,"typename":"科技"},{"id":7,"typename":"热点"},{"id":8,"typename":"推荐"},{"id":9,"typename":"军事"},{"id":10,"typename":"时尚"},{"id":11,"typename":"历史"},{"id":12,"typename":"旅游"},{"id":13,"typename":"美文"},{"id":14,"typename":"美食"}]
     * msg : 操作成功
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * typename : 游戏
         */

        private float id;
        private String typename;

        public float getId() {
            return id;
        }

        public void setId(float id) {
            this.id = id;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }
    }
}
