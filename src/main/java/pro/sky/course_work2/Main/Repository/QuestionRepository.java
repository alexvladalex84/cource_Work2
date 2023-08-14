package pro.sky.course_work2.Main.Repository;

import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question, Question answer);
    Question add(Question question);
    Question remove(Question question);


    Collection<Question> getAll();
    Question getRandomQuestions();

}
