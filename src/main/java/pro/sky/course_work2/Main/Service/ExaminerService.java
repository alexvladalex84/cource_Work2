package pro.sky.course_work2.Main.Service;

import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;

public interface ExaminerService {


    Collection<Question> getQuestionsJava(int amount);

    Collection<Question> getQuestionsMath(int amount);
}
