package model;

public class SearchModel {
    String ShopNameId, ShopAddressId;
    Integer ShopImageId;

    public String getShopNameId() {
        return ShopNameId;
    }

    public void setShopNameId(String shopNameId) {
        ShopNameId = shopNameId;
    }

    public String getShopAddressId() {
        return ShopAddressId;
    }

    public void setShopAddressId(String shopAddressId) {
        ShopAddressId = shopAddressId;
    }

    public Integer getShopImageId() {
        return ShopImageId;
    }

    public void setShopImageId(Integer shopImageId) {
        ShopImageId = shopImageId;
    }

    public SearchModel(String shopName_, String shop_Address_, Integer shop_Image_Id) {
        ShopNameId = shopName_;
        ShopAddressId = shop_Address_;
        ShopImageId = shop_Image_Id;
    }


}
