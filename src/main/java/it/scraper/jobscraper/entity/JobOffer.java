package it.scraper.jobscraper.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobOffer")
@Entity
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String city;
    private String companyName;
    private String sector;
    private String jobOfferImgUrl;
    private String degreeTitle;
    private String workingTime;
    private String contractType;
    private String telephoneNumber;
    private String jobOfferUrl;
    private String jobOfferDate;
}
