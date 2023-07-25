package net.javaguides.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LoginResponse {
    @Id
    private String message;
    private String status;
    // 构造函数、Getter 和 Setter 方法

}
