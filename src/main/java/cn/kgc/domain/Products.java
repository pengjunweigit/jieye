package cn.kgc.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Products {
    private Integer id;
    private String productName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date productDare;
    private Integer productSum;
    private String productDesc;
    private Float productPrice;

    public Products() {
    }

    public Products(Integer id, String productName, Date productDare, Integer productSum, String productDesc, Float productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDare = productDare;
        this.productSum = productSum;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getProductDare() {
        return productDare;
    }

    public void setProductDare(Date productDare) {
        this.productDare = productDare;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", productName='" + productName + '\'' + ", productDare=" + productDare + ", productSum=" + productSum + ", productDesc='" + productDesc + '\'' + ", productPrice=" + productPrice + '}';
    }
}
