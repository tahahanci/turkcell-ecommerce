package com.tahahanci.turkcell_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Entity
@Table(name = "productsuppliers")
public class ProductSupplier {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int productSupplierID;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToMany(mappedBy = "productSupplier")
    @JsonIgnore
    private List<Discount> discounts;

    public ProductSupplier() {
    }

    public ProductSupplier(int productSupplierID, Supplier supplier, Product product, List<Discount> discounts) {
        this.productSupplierID = productSupplierID;
        this.supplier = supplier;
        this.product = product;
        this.discounts = discounts;
    }

    public int getProductSupplierID() {
        return productSupplierID;
    }

    public void setProductSupplierID(int productSupplierID) {
        this.productSupplierID = productSupplierID;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }
}
