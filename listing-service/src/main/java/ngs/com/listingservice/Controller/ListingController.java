package ngs.com.listingservice.Controller;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import ngs.com.listingservice.Model.Listing;
import ngs.com.listingservice.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listings")
@Slf4j
public class ListingController {

  @Autowired
  private ListingService listingService;

  @GetMapping("/")
  public List<Listing> getAll() {
    log.info("Saved the listing information inside Listing Controller");
    return listingService.getAll();
  }

  @PostMapping("/")
  public Listing saveListing(@RequestBody Listing l) {
    log.info("Saved the listing information inside Listing Controller");
    return listingService.saveListing(l);
  }

  @GetMapping("/{id}")
  public Optional<Listing> findListingById(@PathVariable("id") Long id) {
    log.info("Get listing information by ID");
    return listingService.findById(id);
  }
}
