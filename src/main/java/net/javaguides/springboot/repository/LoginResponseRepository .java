// package net.javaguides.springboot.repository;

// import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

// import net.javaguides.springboot.entity.User;

// public interface LoginResponseRepository extends JpaRepository<User, Long> {
// @Query("SELECT u FROM User u WHERE u.USER_ID = :USER_ID AND u.PASSWORD =
// :PassWord")
// List<User> login(@Param("USER_ID") String USER_ID, @Param("PassWord") String
// PassWord);
// }