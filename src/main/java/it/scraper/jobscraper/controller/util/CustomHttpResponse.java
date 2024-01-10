package it.scraper.jobscraper.controller.util;
import org.springframework.http.HttpStatus;

public class CustomHttpResponse {
    String message;
    HttpStatus httpStatus;

    public void setMessage(String s) {
        this.message = s;
    }

    public void setStatus(int value) {
        this.httpStatus = HttpStatus.OK;
    }
}
