package edu.csu.jobsky.bean;

import java.util.List;

/**
 * Created by huangxinqi on 16/2/21.
 */

/* create by huangxinqi 
    on 2016-02-21
    作用:
*/
public class ArticleToShowBean {

    /**
     * articles : [{"id":1349,"title":"福建石狮农商银行","time":"Feb 21, 2016 12:00:00 AM","dataTpye":2,"clickTime":18,"placeFirstID":4,"placeSecondID":0},{"id":1350,"title":"中国铁道科学研究院","time":"Feb 21, 2016 12:00:00 AM","dataTpye":2,"clickTime":22,"placeFirstID":4,"placeSecondID":0},{"id":1352,"title":"福建龙净环保股份有限公司","time":"Feb 21, 2016 12:00:00 AM","dataTpye":2,"clickTime":6,"placeFirstID":4,"placeSecondID":0}]
     * status : 1
     * info : 成功
     */

    private String status;
    private String info;
    /**
     * id : 1349
     * title : 福建石狮农商银行
     * time : Feb 21, 2016 12:00:00 AM
     * dataTpye : 2
     * clickTime : 18
     * placeFirstID : 4
     * placeSecondID : 0
     */

    private List<ArticlesEntity> articles;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setArticles(List<ArticlesEntity> articles) {
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public String getInfo() {
        return info;
    }

    public List<ArticlesEntity> getArticles() {
        return articles;
    }

    public static class ArticlesEntity {
        private int id;
        private String title;
        private String time;
        private int dataTpye;
        private int clickTime;
        private int placeFirstID;
        private int placeSecondID;

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setDataTpye(int dataTpye) {
            this.dataTpye = dataTpye;
        }

        public void setClickTime(int clickTime) {
            this.clickTime = clickTime;
        }

        public void setPlaceFirstID(int placeFirstID) {
            this.placeFirstID = placeFirstID;
        }

        public void setPlaceSecondID(int placeSecondID) {
            this.placeSecondID = placeSecondID;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getTime() {
            return time;
        }

        public int getDataTpye() {
            return dataTpye;
        }

        public int getClickTime() {
            return clickTime;
        }

        public int getPlaceFirstID() {
            return placeFirstID;
        }

        public int getPlaceSecondID() {
            return placeSecondID;
        }
    }
}
