package pro.sky.course_work2.Main.Controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.course_work2.Main.Service.ExaminerService;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

@RestController
@RequestMapping("/ex")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
@GetMapping("/{amount}/get")
   public Collection<Question> getQuestions(@PathVariable int amount) {
       return examinerService.getQuestions(amount);
    }
}
