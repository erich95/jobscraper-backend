package it.scraper.jobscraper;

import it.scraper.jobscraper.controller.JobOfferController;
import it.scraper.jobscraper.entity.JobOffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
@EntityScan("it.scraper.jobscraper.entity")
@EnableJpaRepositories("it.scraper.jobscraper.repository")
@SpringBootApplication(scanBasePackages = {"it.scraper.jobscraper.controller", "it.scraper.jobscraper.service"})
public class JobscraperApplication extends SpringBootServletInitializer {

	private final static Logger log = LogManager.getLogger("Logger");
	@Autowired
	static JobOfferController jobOfferController;

	public static void main(String[] args) {
		SpringApplication.run(JobscraperApplication.class, args);
		log.info("App partita");
	}
	public static List<JobOffer> test() {
		return (List<JobOffer>) jobOfferController.getAllJobOffers();
	}
}
