package com.SpringBoot.Lovable_App.Repository;

import com.SpringBoot.Lovable_App.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
