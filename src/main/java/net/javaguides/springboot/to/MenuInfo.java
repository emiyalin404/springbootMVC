package net.javaguides.springboot.to;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.javaguides.springboot.entity.Children;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu")
public class MenuInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MENU_ID")
    private String menuId;
    @Column(name = "MENU_NAME")
    private String menuName;
    @Column(name = "P_MENU_ID")
    private String pMenuId;
    @Column(name = "SEQ_NO")
    private String seqNo;
    @Column(name = "PAGE")
    private String page;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "PATH")
    private String path;
    @Transient
    private List<Children> children;
}
