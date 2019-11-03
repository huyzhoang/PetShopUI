package model;


public class ModelService   {

    private Integer categoryId;

    private ModelCategory modelCategory;

    private Integer serviceId;

    private String serviceName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ModelCategory getModelCategory() {
        return modelCategory;
    }

    public void setModelCategory(ModelCategory modelCategory) {
        this.modelCategory = modelCategory;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
