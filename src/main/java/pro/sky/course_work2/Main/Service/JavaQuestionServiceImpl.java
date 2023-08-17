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
//        String question0= "q?";
//        String answer1= "q!";
//        Question quest1 = new Question(question0,answer1);
//        String question2 = "w?";
//        String answer2= "w!";
//        Question quest2 = new Question(question2,answer2);
//        String question3 = "e?";
//        String answer3= "e!";
//        Question quest3 = new Question(question3,answer3);
//        String question4 = "g?";
//        String answer4= "g!";
//        Question quest4 = new Question(question4,answer4);
//        String question5 = "h?";
//        String answer5= "h!";
//        Question quest5 = new Question(question5,answer5);

        javaQuestionRepository.add(question1);
//        javaQuestionRepository.add(quest1);
//        javaQuestionRepository.add(quest2);
//        javaQuestionRepository.add(quest3);
//        javaQuestionRepository.add(quest4);
//        javaQuestionRepository.add(quest5);
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
    public Collection<Question> getRandomQuestions() {
        Random random = new Random();
        List<Question> questionList = new ArrayList<>(javaQuestionRepository.getQuestionSet());
        Collections.shuffle(questionList);
//        questionList.get( random.nextInt(0,javaQuestionRepository.getQuestionSet()));

        return questionList;
    }
}