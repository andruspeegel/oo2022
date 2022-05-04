package ee.andrus.webshop.repository;

import ee.andrus.webshop.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {


}
