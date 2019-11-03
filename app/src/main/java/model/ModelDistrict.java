package model;


public class ModelDistrict {
    private Integer districtId;
    private String districtName;
    private ModelCity modelCity;

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public ModelCity getModelCity() {
        return modelCity;
    }

    public void setModelCity(ModelCity modelCity) {
        this.modelCity = modelCity;
    }

}
