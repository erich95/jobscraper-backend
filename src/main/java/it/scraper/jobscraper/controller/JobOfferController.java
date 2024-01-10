package it.scraper.jobscraper.controller;

import com.google.gson.Gson;
import it.scraper.jobscraper.controller.util.CustomHttpResponse;
import it.scraper.jobscraper.entity.JobOffer;
import it.scraper.jobscraper.repository.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobOfferController {
    @Autowired
    private JobOfferRepository jobOfferRepository;

    @GetMapping(value="/offers", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<JobOffer>> getAllJobOffers() {
        return new ResponseEntity<>(jobOfferRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping(value="/newOffer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addJobOffer(@RequestBody JobOffer jobOffer) {
        jobOfferRepository.save(jobOffer);
        CustomHttpResponse customHttpResponse = new CustomHttpResponse();
        customHttpResponse.setMessage("Annuncio inserito correttamente");
        customHttpResponse.setStatus(HttpStatus.OK.value());
        return new ResponseEntity<>(new Gson().toJson(customHttpResponse), HttpStatus.OK);
    }
    @PostMapping(value="/modifyOffer")
    public void modifyJobOffer(JobOffer jobOffer, Integer id) {
    }
}
