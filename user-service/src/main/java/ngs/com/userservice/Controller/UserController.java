package ngs.com.userservice.Controller;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import ngs.com.userservice.Model.User;
import ngs.com.userservice.Service.UserService;
import ngs.com.userservice.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/")
  public List<User> findAll() {
    return userService.findAll();
  }

  @PostMapping("/")
  public User saveUser(@RequestBody User user) {
    log.info(user.toString());
    return userService.saveUser(user);
  }

  @GetMapping("/{id}")
  public Optional<User> findById(@PathVariable("id") Long id) {
    return userService.findUserById(id);
  }

  @GetMapping("/u/{id}")
  public ResponseTemplateVO getUsersWithListing(
    @PathVariable("id") Long userId
  ) {
    return userService.getUsersWithListing(userId);
  }
}
