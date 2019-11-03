package model;


public class ModelShopService {


    private Integer executeTime;

    private ModelDiscount modelDiscount;

    private ModelShop modelShop;

    private ModelService modelService;

    private Integer price;

    private Integer shopServiceId;

    private String status;

    private String thumnailUrl;

    private double distance;
    private double discountPoint;
    private double ratingPoint;
    private double distancePoint;
    private double avgPoint;

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

    public void setDistancePoint(int distancePoint) {
        this.distancePoint = distancePoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public void setDiscountPoint(int discountPoint) {
        this.discountPoint = discountPoint;
    }

    public ModelDiscount getModelDiscount() {
        return modelDiscount;
    }

    public void setModelDiscount(ModelDiscount modelDiscount) {
        this.modelDiscount = modelDiscount;
    }


    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getThumnailUrl() {
        return thumnailUrl;
    }

    public void setThumnailUrl(String thumnailUrl) {
        this.thumnailUrl = thumnailUrl;
    }

    public ModelShop getModelShop() {
        return modelShop;
    }

    public void setModelShop(ModelShop modelShop) {
        this.modelShop = modelShop;
    }

    public Integer getShopServiceId() {
        return shopServiceId;
    }

    public void setShopServiceId(Integer shopServiceId) {
        this.shopServiceId = shopServiceId;
    }
}
