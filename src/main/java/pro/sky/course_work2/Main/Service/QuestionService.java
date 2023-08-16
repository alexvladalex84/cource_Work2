package pro.sky.course_work2.Main.Service;

import org.springframework.stereotype.Component;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;
import java.util.Set;

public interface QuestionService {
    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);


    Collection<Question> getAll();
   Collection<Question> getRandomQuestions();

}
