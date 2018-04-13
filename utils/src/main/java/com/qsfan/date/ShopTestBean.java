package com.qsfan.date;

import java.util.List;

/**
 * =============版权所有===============
 * <p>
 * 类注释:
 * 作者: QSFan
 * 邮箱: qsfan_vip.163.com
 * 时间: 2018/4/12
 * 版本:
 * 备注：
 * ==============版权所有===============
 */
public class ShopTestBean {


    /**
     * status : 200
     * msg : 查询公司成功
     * data : [{"id":1,"title":"赛昂","synopsis":"123765432","content":"123456778","image":"","time":"","comment":"","laud":""}]
     */

    private int status;
    private String msg;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
         * title : 赛昂
         * synopsis : 123765432
         * content : 123456778
         * image :
         * time :
         * comment :
         * laud :
         */

        private int id;
        private String title;
        private String synopsis;
        private String content;
        private String image;
        private String time;
        private String comment;
        private String laud;
        private String price;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getLaud() {
            return laud;
        }

        public void setLaud(String laud) {
            this.laud = laud;
        }
    }
}
