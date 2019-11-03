package model;


public class ModelShop {

    private Integer shop_img;
    private String shop_name;
    private Integer shopId;
    private ModelAddress modelAddress;
    private Integer ownerId;
    private String description;
    private float averageRating;
    private float avgDiscount;
    private double distance;
    private double discountPoint;
    private double ratingPoint;
    private double distancePoint;
    private double avgPoint;

public ModelShop (Integer shop_img, String shop_name) {
    this.shop_img = shop_img;
    this.shop_name = shop_name;
}
    public Integer getShop_img() {
        return shop_img;
    }

    public void setShop_img(Integer shop_img) {
        this.shop_img = shop_img;
    }


    public ModelAddress getModelAddress() {
        return modelAddress;
    }

    public void setModelAddress(ModelAddress modelAddress) {
        this.modelAddress = modelAddress;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public float getAvgDiscount() {
        return avgDiscount;
    }

    public void setAvgDiscount(float avgDiscount) {
        this.avgDiscount = avgDiscount;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDiscountPoint() {
        return discountPoint;
    }

    public void setDiscountPoint(double discountPoint) {
        this.discountPoint = discountPoint;
    }

    public double getRatingPoint() {
        return ratingPoint;
    }

    public void setRatingPoint(double ratingPoint) {
        this.ratingPoint = ratingPoint;
    }

    public double getDistancePoint() {
        return distancePoint;
    }

    public void setDistancePoint(double distancePoint) {
        this.distancePoint = distancePoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
