package pro.sky.course_work2.Main.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;
@Service
public class MathQuestionServiceImpl implements QuestionService {
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Collection<Question> getRandomQuestions() {
        return null;
    }
}
