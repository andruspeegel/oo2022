package ee.andrus.webshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue
    Long id;
    String question;
    String answer;
    boolean answered;
}
