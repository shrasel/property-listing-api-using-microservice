package ngs.com.listingservice.Model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Listing {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "listing_id")
  private String listingId;

  @Column(name = "asking_price")
  private double askingPrice;

  @Column(columnDefinition = "TEXT")
  private String description;

  private double price;
  private String address;
  private String city;
  private String state;

  @Column(name = "post_code")
  private String postCode;

  @Column(name = "created_at")
  private Date createdAt;
}
