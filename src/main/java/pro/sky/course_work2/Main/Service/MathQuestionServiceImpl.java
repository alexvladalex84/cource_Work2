package pro.sky.course_work2.Main.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.Repository.QuestionRepository;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Service
public class MathQuestionServiceImpl implements QuestionService {
    private final QuestionRepository mathQuestionRepository;

    public MathQuestionServiceImpl(@Qualifier("mathQuestionRepositoryImpl") QuestionRepository mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @Override

    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        mathQuestionRepository.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        mathQuestionRepository.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        mathQuestionRepository.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestionRepository.getQuestionSet();
    }

    @Override
    public Question getRandomQuestions() {
        Random random = new Random();
        List<Question> questionList = new ArrayList<>(mathQuestionRepository.getQuestionSet());
        return questionList.get(random.nextInt(0, questionList.size()));
    }
}
