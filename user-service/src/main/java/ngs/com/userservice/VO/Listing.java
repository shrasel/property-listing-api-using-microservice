package ngs.com.userservice.VO;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Listing {

  private Long id;

  private String listingId;

  private double askingPrice;

  private String description;

  private double price;
  private String address;
  private String city;
  private String state;

  private String postCode;

  private Date createdAt;
}
