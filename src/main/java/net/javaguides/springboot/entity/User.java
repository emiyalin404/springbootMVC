package net.javaguides.springboot.entity;

// import java.time.LocalDateTime;

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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("USER_ID")
    private String USER_ID;
    @JsonProperty("USER_NAME")
    private Long USER_NAME;
    @JsonProperty("PASSWORD")
    private String PASSWORD;
    @JsonProperty("IS_VALID")
    private String IS_VALID;
    // private LocalDateTime create_time;
    // private String creator;
    // private String updater;
    // private LocalDateTime update_time;

}
