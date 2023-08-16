package pro.sky.course_work2.Main.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pro.sky.course_work2.Main.Repository.JavaQuestionRepositoryImpl;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final JavaQuestionRepositoryImpl javaQuestionRepository;

    public JavaQuestionServiceImpl(JavaQuestionRepositoryImpl javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override

    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
//        String question0= "1?";
//        String answer1= "1!";
//        Question quest1 = new Question(question0,answer1);
//        String question2 = "2?";
//        String answer2= "2!";
//        Question quest2 = new Question(question2,answer2);
//        String question3 = "3?";
//        String answer3= "3!";
//        Question quest3 = new Question(question3,answer3);
//        String question4 = "4?";
//        String answer4= "4!";
//        Question quest4 = new Question(question4,answer4);
//        String question5 = "5?";
//        String answer5= "5!";
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