package pro.sky.course_work2.Main.Repository;

import org.springframework.stereotype.Repository;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Repository
public class JavaQuestionRepositoryImpl implements QuestionRepository {
    Map<Question, Question> reposQuestAndAnswer= new HashMap<>();

    List<String> mainListWisQuestionAndAnswer = new ArrayList<>();


    @Override
    public Question add(Question question, Question answer) {

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
    public Question getRandomQuestions() {
        return null;
    }

    private List<String> ddd() {
       return mainListWisQuestionAndAnswer.add(String cddcd = "ggggg");

    }
}
