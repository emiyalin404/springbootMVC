package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.javaguides.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("""
            SELECT i FROM User i WHERE \
            i.USER_ID LIKE CONCAT('%' ,:query, '%')\
            And i.PASSWORD LIKE CONCAT( '%', :query, '%')\
            """)
    List<User> searchUsers(String query);

    @Query("SELECT i FROM User i WHERE i.USER_ID = :USER_ID AND i.PASSWORD = :PassWord")
    List<User> UserLogin(@Param("USER_ID") String USER_ID, @Param("PassWord") String PassWord);
    // @Query("SELECT i FROM User i WHERE " +
    // "i.USER_NAME = ('%',:User_Name, '%')" +
    // "And i.PASSWORD = ('%',:PassWord, '%')")
    // List<User> UserLogin(String User_Name, String PassWord);
}
