package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
        @Query("SELECT p FROM Product p" +
                        " WHERE p.ITEM_NAME LIKE CONCAT('%' ,:ItemName, '%')")
        // "Or p.description LIKE CONCAT( '%', :ItemName, '%') ")
        List<Product> searchProducts(String ItemName);

        @Query("SELECT p FROM Product p")
        List<Product> AllProduct();

        @Modifying
        @Query("INSERT INTO Product p (" +
                        " p.ITEM_NO, p.ITEM_NAME, p.PRICE, p.TAX, p.CREATOR ) " +
                        " values ( :ItemNo, :ItemName, :Price, :Tax, :Creator )")
        Product AddProduct(@Param("ItemNo") String ItemNo, @Param("ItemName") String ItemName,
                        @Param("Price") String Price, @Param("Tax") String Tax, @Param("Creator") String Creator);

        @Query(" UPDATE  Product p " +
                        "SET  p.ITEM_NAME = :ItemName, p.PRICE = :Price," +
                        " p.EFF_DATE_FROM = :EffDateFrom, p.EFF_DATE_TO = :EffDateTo," +
                        " p.TAX = :Tax, p.CREATOR = :Creator" +
                        " WHERE p.ITEM_NO = :ItemNo ")
        Product UpdateProduct(@Param("ItemNo") String ItemNo, @Param("ItemName") String ItemName,
                        @Param("EffDateFrom") String EffDateFrom, @Param("EffDateTo") String EffDateTo,
                        @Param("Price") String Price, @Param("Tax") String Tax, @Param("Creator") String Creator);

        @Query(" DELETE FROM Product p " +
                        " WHERE p.ITEM_NO = :ItemNo")
        Product DeleteProduct(@Param("ItemNo") String ItemNo);

}
