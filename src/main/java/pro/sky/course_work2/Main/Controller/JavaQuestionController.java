package pro.sky.course_work2.Main.Controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.course_work2.Main.Service.QuestionService;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

@RestController
@RequestMapping("/java")

public class JavaQuestionController {


    private final QuestionService questionService;

    public JavaQuestionController(@Qualifier("javaQuestionServiceImpl") QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping("/java")
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

    @GetMapping(path = "/java/add")
    public Question add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return questionService.add(question, answer);

    }

    @GetMapping(path = "/java/remove")
    public Question remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        Question removableQuestion = new Question(question, answer);
        return questionService.remove(removableQuestion);
    }

}
