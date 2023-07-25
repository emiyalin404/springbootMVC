// package net.javaguides.springboot.repository;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

// // import net.javaguides.springboot.entity.LoginResponse;
// import net.javaguides.springboot.to.LoginTo;

// public interface Login extends JpaRepository<LoginTo, Long> {
// @Query("SELECT i FROM LoginTo i WHERE i.USER_ID = :USER_ID AND i.PASSWORD
// =:PassWord")
// LoginTo login(@Param("USER_ID") String USER_ID,
// @Param("PassWord") String PassWord);
// }
