package ngs.com.userservice.Repository;

import java.util.Optional;
import ngs.com.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUserId(Long userId);
}
