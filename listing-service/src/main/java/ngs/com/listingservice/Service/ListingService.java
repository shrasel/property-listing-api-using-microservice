package ngs.com.listingservice.Service;

import java.util.List;
import java.util.Optional;
import ngs.com.listingservice.Model.Listing;
import ngs.com.listingservice.Repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListingService {

  @Autowired
  private ListingRepository listingRepository;

  public Listing saveListing(Listing l) {
    return listingRepository.save(l);
  }

  public Optional<Listing> findById(Long id) {
    return listingRepository.findById(id);
  }

  public List<Listing> getAll() {
    return listingRepository.findAll();
  }
}
