package com.qsfan.date;

import java.util.ArrayList;
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
public class ShopTestDate {
    public ShopTestBean shopDate() {
        ShopTestBean shopTestBean = new ShopTestBean();
        shopTestBean.setStatus(200);
        shopTestBean.setMsg("获取列表成功");
        ArrayList<ShopTestBean.DataBean> dataBeans = new ArrayList<>();
        for (int i = 0; i < initTitle().size(); i++) {
            ShopTestBean.DataBean bean = new ShopTestBean.DataBean();
            bean.setId(i);
            bean.setTitle(initTitle().get(i));
            bean.setSynopsis(initSynopsis().get(i));
            bean.setContent(initContent().get(i));
            bean.setImage(initImage().get(i));
            bean.setTime(initTime().get(i));
            bean.setComment(initComment().get(i));
            bean.setLaud(initLaud().get(i));
            bean.setPrice(initPrice().get(i));
            dataBeans.add(bean);
        }
        shopTestBean.setData(dataBeans);
        return shopTestBean;
    }

    /**
     * 初始化标题
     */
    private List<String> initTitle() {
        List<String> title = new ArrayList<>();
        title.add("雪纺衫性感大V领镂空挂脖上衣");
        title.add("半袖上衣服女装潮");
        title.add("2018夏新款白色上衣宽松短袖t恤");
        title.add("新款纯棉韩版宽松体恤");
        title.add("黑色睫毛蕾丝吊带背心");
        title.add("甜美娃娃衫上衣超仙洋气小碎花");
        title.add("中老年人女装春秋装外套");
        title.add("ins同款下衣失踪短袖t恤");
        title.add("新款大码女装胖mm套装");
        title.add("张大奕紫色卫衣女中长款");
        return title;
    }

    /**
     * 初始化简介
     */
    private List<String> initSynopsis() {
        List<String> synopsis = new ArrayList<>();
        synopsis.add("自制大码女装2018春装新款200斤胖mm雪纺衫性感大V领镂空挂脖上衣");
        synopsis.add("白色t恤女短袖夏装2018新款韩版宽松百搭ulzzang半袖上衣服女装潮");
        synopsis.add("【2件59元】2018夏新款白色上衣宽松短袖t恤女装ins半袖体恤衣服");
        synopsis.add("【2件89元】白色短袖t恤女2018夏季新款纯棉韩版宽松体恤半袖上衣");
        synopsis.add("黑色睫毛蕾丝吊带背心女外穿夏内搭宽松打底短款性感V领雪纺上衣");
        synopsis.add("夏装2018新款甜美娃娃衫上衣超仙洋气小碎花清新一字露肩雪纺衫女");
        synopsis.add("中老年人女装春秋装外套70岁60妈妈装春装风衣80老人奶奶上衣薄款");
        synopsis.add("ins同款下衣失踪短袖t恤女夏韩范港风蹦迪宽松大bf风半袖上衣潮人");
        synopsis.add("2018夏季新款大码女装胖mm套装纯棉上衣宽松显瘦牛仔裤减龄两件套");
        synopsis.add("张大奕紫色卫衣女中长款2018春季新款圆领套头宽松bf风无帽上衣潮");
        return synopsis;
    }

    /**
     * 初始化内容
     */
    private List<String> initContent() {
        List<String> content = new ArrayList<>();
        content.add("");
        content.add("");
        content.add("");
        content.add("");
        content.add("");
        content.add("");
        content.add("");
        return content;
    }

    /**
     * 初始化价格
     */
    private List<String> initPrice() {
        List<String> price = new ArrayList<>();
        price.add("123.00");
        price.add("344.00");
        price.add("12.99");
        price.add("345.00");
        price.add("91.00");
        price.add("88.88");
        price.add("77.77");
        price.add("345.99");
        price.add("111.00");
        price.add("78.99");
        return price;
    }

    /**
     * 初始化图片
     */
    private List<String> initImage() {
        List<String> image = new ArrayList<>();
        image.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i2/73903600/TB2bj_dfY1YBuNjSszeXXablFXa_!!73903600.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/2816110050/TB1xT2NeH9YBuNjy0FgXXcxcXXa_!!2-item_pic.png_460x460Q90.jpg_.webp");
        image.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i3/3869110671/TB2alkOcUOWBKNjSZKzXXXfWFXa_!!3869110671.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i2/1028150634/TB2_LrjdAfb_uJkSnb4XXXCrXXa_!!1028150634.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/157368607/TB2KKBphElnpuFjSZFjXXXTaVXa_!!157368607.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i3/13410985/TB2jNEZeA9WBuNjSspeXXaz5VXa_!!13410985.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search3.alicdn.com/img/bao/uploaded/i4/i1/656600248/TB2qn9xkfDH8KJjy1XcXXcpdXXa_!!656600248.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i2/594356236/TB2qvclfXGWBuNjy0FbXXb4sXXa_!!594356236.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search2.alicdn.com/img/bao/uploaded/i4/i3/1130359483/TB2bzwVe25TBuNjSspmXXaDRVXa_!!1130359483.jpg_460x460Q90.jpg_.webp");
        image.add("https://g-search1.alicdn.com/img/bao/uploaded/i4/i1/2103587316/TB2TgOEbhGYBuNjy0FnXXX5lpXa_!!2103587316.jpg_460x460Q90.jpg_.webp");
        return image;
    }

    /**
     * 初始化时间
     */
    private List<String> initTime() {
        List<String> time = new ArrayList<>();
        time.add("4月12日 8:09");
        time.add("4月12日 12:23");
        time.add("4月12日 15:09");
        time.add("4月12日 15:19");
        time.add("4月12日 18:01");
        time.add("4月12日 18:06");
        time.add("4月12日 18:12");
        time.add("4月12日 18:51");
        time.add("4月12日 20:31");
        time.add("4月12日 20:52");
        return time;
    }

    /**
     * 初始化评论
     */
    private List<String> initComment() {
        List<String> comment = new ArrayList<>();
        comment.add("234");
        comment.add("1265");
        comment.add("977");
        comment.add("326");
        comment.add("19");
        comment.add("3456");
        comment.add("1941");
        comment.add("528");
        comment.add("343");
        comment.add("786");
        return comment;
    }

    /**
     * 初始化赞
     */
    private List<String> initLaud() {
        List<String> laud = new ArrayList<>();
        laud.add("28394");
        laud.add("68234");
        laud.add("5203");
        laud.add("2638");
        laud.add("5229");
        laud.add("1883");
        laud.add("8931");
        laud.add("3141");
        laud.add("9522");
        laud.add("3945");
        return laud;
    }

}
