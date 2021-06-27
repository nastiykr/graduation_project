package domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties (ignoreUnknown = true)
public class Product {

    private String id;
//    private String name;
    private String url;
    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("brand_id")
    private String brandId;
    @JsonProperty("specs_quantity")
    private String specsQuantity;
    @JsonProperty("reviews_quantity")
    private String reviewsQuantity;
    @JsonProperty("photos_quantity")
    private String photosQuantity;
    private String rating;
    private String modof;
    private String price;
    @JsonProperty("price_updated")
    private String priceUpdated;
    @JsonProperty("sku_quantity")
    private String skuQuantity;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getSpecsQuantity() {
        return specsQuantity;
    }

    public void setSpecsQuantity(String specsQuantity) {
        this.specsQuantity = specsQuantity;
    }

    public String getReviewsQuantity() {
        return reviewsQuantity;
    }

    public void setReviewsQuantity(String reviewsQuantity) {
        this.reviewsQuantity = reviewsQuantity;
    }

    public String getPhotosQuantity() {
        return photosQuantity;
    }

    public void setPhotosQuantity(String photosQuantity) {
        this.photosQuantity = photosQuantity;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getModof() {
        return modof;
    }

    public void setModof(String modof) {
        this.modof = modof;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceUpdated() {
        return priceUpdated;
    }

    public void setPriceUpdated(String priceUpdated) {
        this.priceUpdated = priceUpdated;
    }

    public String getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(String skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&  Objects.equals(url, product.url) && Objects.equals(categoryId, product.categoryId) && Objects.equals(brandId, product.brandId) && Objects.equals(specsQuantity, product.specsQuantity) && Objects.equals(reviewsQuantity, product.reviewsQuantity) && Objects.equals(photosQuantity, product.photosQuantity) && Objects.equals(rating, product.rating) && Objects.equals(modof, product.modof) && Objects.equals(price, product.price) && Objects.equals(priceUpdated, product.priceUpdated) && Objects.equals(skuQuantity, product.skuQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, categoryId, brandId, specsQuantity, reviewsQuantity, photosQuantity, rating, modof, price, priceUpdated, skuQuantity);
    }
}
