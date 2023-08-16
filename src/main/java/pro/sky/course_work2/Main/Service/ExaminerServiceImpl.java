package pro.sky.course_work2.Main.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.course_work2.Main.Exception.AmountQuestionException;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new AmountQuestionException("Введенное значение превышает колличество вопросов в коллекции");
        }
        Set<Question> questionList1 = new HashSet<>();
        int counter = 1;
        for (Question q : questionService.getRandomQuestions()) {
            if (counter <= amount ) {
                questionList1.add(q);
            }
            counter++;
        }


        return questionList1;
    }
}
