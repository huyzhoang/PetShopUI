package model;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class ShopHomeServiceModel {
    Integer resimage;
    String txtregulargift;

    public Integer getResimage() {
        return resimage;
    }

    public void setResimage(Integer resimage) {
        this.resimage = resimage;
    }

    public String getTxtregulargift() {
        return txtregulargift;
    }

    public void setTxtregulargift(String txtregulargift) {
        this.txtregulargift = txtregulargift;
    }

    public ShopHomeServiceModel(Integer resimage, String txtregulargift) {
        this.resimage = resimage;
        this.txtregulargift = txtregulargift;
    }
}
