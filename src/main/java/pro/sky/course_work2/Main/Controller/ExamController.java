package pro.sky.course_work2.Main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work2.Main.Service.ExaminerService;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

@RestController
@RequestMapping("/get")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {

        this.examinerService = examinerService;
    }

    @GetMapping("/java/{amount}")
    public Collection<Question> getQuestionsJava(@PathVariable int amount) {

        return examinerService.getQuestionsJava(amount);
    }

    @GetMapping("/math/{amount}")
    public Collection<Question> getQuestionsMath(@PathVariable int amount) {

        return examinerService.getQuestionsMath(amount);
    }
}
