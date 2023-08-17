package pro.sky.course_work2.Main.Repository;

import pro.sky.course_work2.Main.model.Question;

import java.util.Set;

public interface QuestionRepository {


    //    public Map<String, String> getQuestionMap() {
//        return questionAndAnswerMap;
//    }
    Set<Question> getQuestionSet();

    Question add(Question question);

    void remove(Question question);


}
