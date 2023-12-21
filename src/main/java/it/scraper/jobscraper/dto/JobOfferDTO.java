package it.scraper.jobscraper.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class JobOfferDTO {
    private int id;
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
