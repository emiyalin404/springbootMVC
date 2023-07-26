package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("ITEM_NO")
    private String ITEM_NO;
    @JsonProperty("ITEM_NAME")
    private String ITEM_NAME;
    @JsonProperty("PRICE")
    private String PRICE;
    @JsonProperty("EFF_DATE_FROM")
    private String EFF_DATE_FROM;
    @JsonProperty("EFF_DATE_TO")
    private String EFF_DATE_TO;
    @JsonProperty("TAX")
    private String TAX;
    @JsonProperty("CREATOR")
    private String CREATOR;
    @JsonProperty("CTEATE_TIME")
    @CreationTimestamp
    private LocalDateTime CTEATE_TIME;
    @JsonProperty("UPDATER")
    private String UPDATER;
    @UpdateTimestamp
    @JsonProperty("UPDATAE_TIME")
    private LocalDateTime UPDATAE_TIME;
    @JsonProperty("create_time")
    private LocalDateTime create_time;

}
