package net.javaguides.springboot.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "base_param")
public class BaseParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("TITLE")
    public String TITLE;
    @JsonProperty("TAG")
    public String TAG;
    public String SEQ_NO;
    public String CONTENT;
    public String CONTENT_ZH_CN;
    public String CONTENT_ZH_TW;
    public String CONTENT_EN_US;
    public String LANGUAGE;
    public String NOTES;
    public String STATUS;
    public String CREATOR;
    public String CREATE_TIME;
    public String UPDATER;
    public String UPDATAE_TIME;
}
