package it.scraper.jobscraper.repository;

import it.scraper.jobscraper.entity.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobOfferRepository extends JpaRepository<JobOffer, Integer> {

    List<JobOffer> findByCityIgnoreCase(String city);

    List<JobOffer> findBySectorIgnoreCase(String sector);

    List<JobOffer> findByDescriptionContainingIgnoreCase(String description);

}
