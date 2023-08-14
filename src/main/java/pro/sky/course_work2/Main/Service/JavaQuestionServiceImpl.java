package pro.sky.course_work2.Main.Service;

import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.Repository.JavaQuestionRepositoryImpl;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final JavaQuestionRepositoryImpl javaQuestionRepository;

    public JavaQuestionServiceImpl(JavaQuestionRepositoryImpl javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override

    public Question add(Question question, Question answer) {
        return javaQuestionRepository.add(question,answer);

    }

    @Override
    public Question add(Question question) {
        return javaQuestionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return javaQuestionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestionRepository.getAll();

    }

    @Override
    public Question getRandomQuestions() {
        return javaQuestionRepository.getRandomQuestions();
    }
}
