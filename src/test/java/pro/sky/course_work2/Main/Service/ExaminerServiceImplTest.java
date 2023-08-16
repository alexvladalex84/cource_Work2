package pro.sky.course_work2.Main.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.course_work2.Main.Exception.AmountQuestionException;
import pro.sky.course_work2.Main.model.Question;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @InjectMocks
    private ExaminerServiceImpl examinerService;
    @Mock
    private JavaQuestionServiceImpl javaQuestionService;

    @Test
    void getQuestions() {
        // подготовка входных данных
        String question1 = "1?";
        String answer1 = "1!";
        Question quest1 = new Question(question1, answer1);
        String question2 = "2?";
        String answer2 = "2!";
        Question quest2 = new Question(question2, answer2);
        String question3 = "3?";
        String answer3 = "3!";
        Question quest3 = new Question(question3, answer3);
        String question4 = "4?";
        String answer4 = "4!";
        Question quest4 = new Question(question4, answer4);
        String question5 = "5?";
        String answer5 = "5!";
        Question quest5 = new Question(question5, answer5);
        int amount = 1;
// подготовка ожидаемого результата
        when(javaQuestionService.getRandomQuestions()).thenReturn(Set.of(quest1, quest2, quest3, quest4, quest5));
        Set<Question> expectedList = new HashSet<>(Set.of(quest1, quest2, quest3, quest4, quest5));
//   начало теста
        Collection<Question> actualList = examinerService.getQuestions(amount);
        assertEquals(expectedList, actualList);
//        assertNotEquals(expectedList,actualList);
//        verify(javaQuestionService).getRandomQuestions();
    }

    @Test
    void getQuestions_amountException() {
        // подготовка входных данных
        String question1 = "1?";
        String answer1 = "1!";
        Question quest1 = new Question(question1, answer1);
        String question2 = "2?";
        String answer2 = "2!";
        Question quest2 = new Question(question2, answer2);
        String question3 = "3?";
        String answer3 = "3!";
        Question quest3 = new Question(question3, answer3);

        int amount = 4;
        // подготовка ожидаемого результата
        when(javaQuestionService.getAll()).thenReturn(Set.of(quest1, quest2, quest3));
        String expectedErrorMessage = "Введенное значение превышает колличество вопросов в коллекции";
        //        начало теста
        Exception exception = assertThrows(AmountQuestionException.class,
                () -> examinerService.getQuestions(amount));
        assertEquals(expectedErrorMessage, exception.getMessage());
        verify(javaQuestionService).getAll();
    }
}