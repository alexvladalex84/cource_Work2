package pro.sky.course_work2.Main.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.Repository.QuestionRepository;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final QuestionRepository javaQuestionRepository;

    public JavaQuestionServiceImpl(@Qualifier("javaQuestionRepositoryImpl") QuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override

    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);


        javaQuestionRepository.add(question1);

        return question1;

    }

    @Override
    public Question add(Question question) {
        javaQuestionRepository.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        javaQuestionRepository.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {

        return javaQuestionRepository.getQuestionSet();
    }

    @Override
    public Question getRandomQuestions() {
//        List<Question> questionList = new ArrayList<>(javaQuestionRepository.getQuestionSet());
//        Collections.shuffle(questionList);
//        return questionList;
        Random random = new Random();
        List<Question> questionList = new ArrayList<>(javaQuestionRepository.getQuestionSet());
        return questionList.get(random.nextInt(0, questionList.size()));

    }
}