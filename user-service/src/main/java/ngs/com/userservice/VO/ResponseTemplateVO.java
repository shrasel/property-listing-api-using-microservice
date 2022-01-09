package ngs.com.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ngs.com.userservice.Model.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

  private User user;
  private Listing listing;
}
