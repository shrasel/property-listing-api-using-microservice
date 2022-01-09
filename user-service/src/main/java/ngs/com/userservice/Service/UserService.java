package ngs.com.userservice.Service;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import ngs.com.userservice.Model.User;
import ngs.com.userservice.Repository.UserRepository;
import ngs.com.userservice.VO.Listing;
import ngs.com.userservice.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RestTemplate restTemplate;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User saveUser(User user) {
    log.info("Service" + user.toString());
    return userRepository.save(user);
  }

  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  public ResponseTemplateVO getUsersWithListing(Long userId) {
    ResponseTemplateVO vo = new ResponseTemplateVO();
    User user = userRepository.findByUserId(userId);
    Listing listing = restTemplate.getForObject(
      "http://localhost:9001/listings/" + user.getListingId(),
      Listing.class
    );

    vo.setUser(user);
    vo.setListing(listing);
    return vo;
  }
}
