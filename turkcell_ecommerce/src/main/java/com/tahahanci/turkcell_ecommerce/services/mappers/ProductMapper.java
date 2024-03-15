package com.tahahanci.turkcell_ecommerce.services.mappers;

import com.tahahanci.turkcell_ecommerce.entities.Product;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.requests.AddProductRequest;
import com.tahahanci.turkcell_ecommerce.services.dtos.product.responses.ProductListResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper
{
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class); // blueprint

    @Mapping(source = "category_id", target = "category.id")
    @Mapping(source = "brand_id", target = "brand.id")
    Product productFromAddRequest(AddProductRequest request);

    @Mapping(source = "category.name", target = "categoryName")
    ProductListResponse productToProductListResponse(Product product);
    // Aynı isime sahip alanlar oto eşlenir.
    // Farklı isime sahip alanlar configure edilmelidir.

}