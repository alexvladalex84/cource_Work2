package pro.sky.course_work2.Main.Repository;

import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

public interface QuestionRepository {


    Question add(Question question);

    void remove(Question question);


}
