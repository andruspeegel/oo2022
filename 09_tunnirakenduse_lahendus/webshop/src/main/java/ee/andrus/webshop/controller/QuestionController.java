package ee.andrus.webshop.controller;

import ee.andrus.webshop.model.Question;
import ee.andrus.webshop.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("questions")// localhost:8080/questions GET
    public List<Question> getQuestions(){
        return questionRepository.findAll();
    }

    @GetMapping("questions/{index}")// localhost:8080/questions/1 GET
    public Question getQuestion(@PathVariable Long index) {
        return questionRepository.findById(index).get();
    }

    @DeleteMapping("questions/{index}") // localhost:8080/questions/1 DELETE
    public List<Question> deleteQuestion(@PathVariable Long index) {
        questionRepository.deleteById(index);
        return questionRepository.findAll();
    }

    @DeleteMapping("questions") // localhost:8080/questions DELETE
    public String deleteAllQuestions() {
        questionRepository.deleteAll();
        return "Kõik küsimused kustutatud";
    }

    @PostMapping("questions") // localhost:8080/questions  POST
    public void addQuestion(@RequestBody Question question) {
        questionRepository.save(question);
    }

    @PutMapping("questions") // localhost:8080/questions  PUT
    public void editQuestion(@RequestBody Question question) {
        questionRepository.save(question);
    }

    @PostMapping("add-all-questions") // localhost:8080/add-all-questions  POST
    public void addAllQuestions(@RequestBody List<Question> questions) {
        questionRepository.saveAll(questions);
    }
}
