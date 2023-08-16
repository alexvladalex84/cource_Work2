package pro.sky.course_work2.Main.Repository;

import org.springframework.stereotype.Repository;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Repository
public class JavaQuestionRepositoryImpl implements QuestionRepository {
    //    Map<String, String> questionAndAnswerMap = new HashMap<>();
    Set<Question> questionSet = new HashSet<>();

//    public Map<String, String> getQuestionMap() {
//        return questionAndAnswerMap;
//    }

    public Set<Question> getQuestionSet() {
        return questionSet;
    }

    @Override
    public Question add(Question question) {
//        questionAndAnswerMap.put(question.getQuestion(), question.getAnswer());
        questionSet.add(question);
        return question;
    }

    @Override
    public void remove(Question question) {
//        questionAndAnswerMap.remove(question.getQuestion());
        questionSet.remove(question);
    }
}






