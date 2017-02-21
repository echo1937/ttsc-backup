package com.taotao.portal.pojo;

/**
 * CartItem包装了加入购物车的商品的基本信息,
 * 用以返回给购物车页面进行商品展示,
 * 避免将整个item保存至cookie, 降低空间占用
 * Created by Eric on 2/21/17.
 */
public class CartItem {

    private long id;
    private String title;
    private Integer num;
    private long price;
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

