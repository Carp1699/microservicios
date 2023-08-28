package com.example.ProductApp.App;

import lombok.Data;

@Data
public class Product {

    private String uniq_id;

    private String sku;

    private String name_title;

    private String description;

    private String list_price;

    private String sale_price;

    private String category;

    private String category_tree;

    private String average_product_rating;

    private String product_url;

    private String product_image_urls;

    private String brand;

    private String total_number_reviews;

    private String Reviews;



    public Product(String uniq_id, String sku, String name_title, String description, String list_price, String sale_price, String category, String category_tree, String average_product_rating, String product_url, String product_image_urls, String brand, String total_number_reviews, String reviews) {
        this.uniq_id = uniq_id;
        this.sku = sku;
        this.name_title = name_title;
        this.description = description;
        this.list_price = list_price;
        this.sale_price = sale_price;
        this.category = category;
        this.category_tree = category_tree;
        this.average_product_rating = average_product_rating;
        this.product_url = product_url;
        this.product_image_urls = product_image_urls;
        this.brand = brand;
        this.total_number_reviews = total_number_reviews;
        Reviews = reviews;
    }

    public Product() {
    }
}