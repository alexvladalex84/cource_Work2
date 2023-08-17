package pro.sky.course_work2.Main.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.Exception.AmountQuestionException;
import pro.sky.course_work2.Main.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService javaQuestionServiceImpl;
    private final QuestionService mathQuestionServiceImpl;


    public ExaminerServiceImpl(@Qualifier("javaQuestionServiceImpl") QuestionService javaQuestionServiceImpl
            , @Qualifier("mathQuestionServiceImpl") QuestionService mathQuestionServiceImpl) {
        this.javaQuestionServiceImpl = javaQuestionServiceImpl;
        this.mathQuestionServiceImpl = mathQuestionServiceImpl;
    }

    @Override

    public Collection<Question> getQuestionsJava(int amount) {
        if (amount > javaQuestionServiceImpl.getAll().size()) {
            throw new AmountQuestionException("Введенное значение превышает колличество вопросов в коллекции");
        }
        Set<Question> questionList1 = new HashSet<>();
        int counter = 1;
        for (Question q : javaQuestionServiceImpl.getRandomQuestions()) {
            if (counter <= amount) {
                questionList1.add(q);
            }
            counter++;
        }


        return questionList1;
    }

    @Override

    public Collection<Question> getQuestionsMath(int amount) {
        if (amount > mathQuestionServiceImpl.getAll().size()) {
            throw new AmountQuestionException("Введенное значение превышает колличество вопросов в коллекции");
        }
        Set<Question> questionList1 = new HashSet<>();
        int counter = 1;
        for (Question q : mathQuestionServiceImpl.getRandomQuestions()) {
            if (counter <= amount) {
                questionList1.add(q);
            }
            counter++;
        }


        return questionList1;
    }
}
