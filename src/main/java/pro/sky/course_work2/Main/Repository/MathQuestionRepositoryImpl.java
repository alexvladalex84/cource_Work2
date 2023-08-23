package pro.sky.course_work2.Main.Repository;

import org.springframework.stereotype.Repository;
import pro.sky.course_work2.Main.model.Question;

import java.util.HashSet;
import java.util.Set;

@Repository
public class MathQuestionRepositoryImpl implements QuestionRepository {
    Set<Question> questionSet = new HashSet<>();

    @Override
    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    @Override
    public Question add(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public void remove(Question question) {
        questionSet.remove(question);

    }
}
