package model;



public class ModelReview  {
    private String comment;
    private String createdDate;
    private Integer rating;
    private Integer reviewId;
    private String status;
    private ModelShop modelShop;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreateDate(String createDate) {
        this.createdDate = createdDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModelShop getModelShop() {
        return modelShop;
    }

    public void setModelShop(ModelShop modelShop) {
        this.modelShop = modelShop;
    }
}
