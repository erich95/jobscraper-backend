package it.scraper.jobscraper.service;

import it.scraper.jobscraper.entity.JobOffer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobOfferService {

    List<JobOffer> findAll();

    JobOffer addJobOffer(JobOffer jobOffer);

    void deleteJobOffer(Integer id);


}
