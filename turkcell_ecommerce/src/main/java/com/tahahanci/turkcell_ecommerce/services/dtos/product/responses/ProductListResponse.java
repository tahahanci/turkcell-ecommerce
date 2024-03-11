package com.tahahanci.turkcell_ecommerce.services.dtos.product.responses;

import lombok.*;



public class ProductListResponse {

        private int id;
        private String name;
        private String description;
        private double price;
        private String categoryName;


        //no args constructor
        public ProductListResponse() {
        }

        //all args constructor
        public ProductListResponse(int id, String name, String description, double price, String categoryName) {
                this.id = id;
                this.name = name;
                this.description = description;
                this.price = price;
                this.categoryName = categoryName;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getCategoryName() {
                return categoryName;
        }

        public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
        }
}
