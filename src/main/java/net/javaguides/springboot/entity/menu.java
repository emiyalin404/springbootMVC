package net.javaguides.springboot.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "menu")
public class menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("MENU_ID")
    private String MENU_ID;
    @JsonProperty("MENU_NAME")
    private String MENU_NAME;
    @JsonProperty("P_MENU_ID")
    private String P_MENU_ID;
    @JsonProperty("SEQ_NO")
    private String SEQ_NO;
    @JsonProperty("PAGE")
    private String PAGE;
    @JsonProperty("ICON")
    private String ICON;
    @JsonProperty("PATH")
    private String PATH;
    @OneToMany(mappedBy = "P_MENU_ID", cascade = CascadeType.ALL)
    private List<Children> children;
    // @JsonProperty("CREATOR")
    // private String CREATOR;
    // @JsonProperty("CREAT_TIME")
    // private String CREAT_TIME;
    // @JsonProperty("UPDATER")
    // private String UPDATER;
    // @JsonProperty("UPDATE_TIME")
    // private String UPDATE_TIME;
}
