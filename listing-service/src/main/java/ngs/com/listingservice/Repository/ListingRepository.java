package ngs.com.listingservice.Repository;

import ngs.com.listingservice.Model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {}
