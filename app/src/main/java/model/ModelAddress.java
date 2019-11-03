package model;



public class ModelAddress {

    private Integer addressId;
    private ModelDistrict modelDistrict;
    private String street;
    private String streetNumber;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public ModelDistrict getModelDistrict() {
        return modelDistrict;
    }

    public void setModelDistrict(ModelDistrict modelDistrict) {
        this.modelDistrict = modelDistrict;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
}
