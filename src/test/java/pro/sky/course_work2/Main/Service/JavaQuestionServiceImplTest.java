package pro.sky.course_work2.Main.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.servlet.tags.form.SelectTag;
import pro.sky.course_work2.Main.Repository.JavaQuestionRepositoryImpl;
import pro.sky.course_work2.Main.Repository.QuestionRepository;
import pro.sky.course_work2.Main.model.Question;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class JavaQuestionServiceImplTest {
    @InjectMocks
    private JavaQuestionServiceImpl questionService;
    @Mock
    private JavaQuestionRepositoryImpl javaQuestionRepository;
    @Test
    void add() {
        // подготовка входных данных
       final String question1= "1?";
       final String answer1= "1!";
       final Question quest1 = new Question(question1,answer1);
       final String question2 = "2?";
       final String answer2= "2!";
       final Question quest2 = new Question(question2,answer2);

// подготовка ожидаемого результата
        Set<Question> expectedList = new HashSet<>(List.of(quest1));
//   начало теста
        Collection<Question> actualList1 = Collections.singleton(questionService.add(quest1));
        assertEquals(expectedList,actualList1);

        Collection<Question> actualList2 = Collections.singleton(questionService.add(quest2));
        assertNotEquals(expectedList,actualList2);

    }

    @Test
    void testAdd() {
        // подготовка входных данных
        final String question1= "1?";
        final String answer1= "1!";
        final Question quest1 = new Question(question1,answer1);
        final String question2 = "2?";
        final String answer2= "2!";
        final Question quest2 = new Question(question2,answer2);

// подготовка ожидаемого результата
        Set<Question> expectedList = new HashSet<>(List.of(quest1));
//   начало теста
        Collection<Question> actualList1 = Collections.singleton(questionService.add(question1,answer1));
        assertEquals(expectedList,actualList1);

        Collection<Question> actualList2 = Collections.singleton(questionService.add(quest2));
        assertNotEquals(expectedList,actualList2);
    }

    @Test
    void remove() {
        // подготовка входных данных
        final String question1= "1?";
        final String answer1= "1!";
        final Question quest1 = new Question(question1,answer1);
        final String question2 = "2?";
        final String answer2= "2!";
        final Question quest2 = new Question(question2,answer2);

// подготовка ожидаемого результата

        Set<Question> expectedList = new HashSet<>(List.of(quest2));
//   начало теста
        Collection<Question> actualList1 = Collections.singleton(questionService.remove(quest2));
        assertEquals(expectedList,actualList1);

    }

    @Test
    void getAll() {
        // подготовка входных данных
        String question1= "1?";
        String answer1= "1!";
        Question quest1 = new Question(question1,answer1);
        String question2 = "2?";
        String answer2= "2!";
        Question quest2 = new Question(question2,answer2);
        String question3 = "3?";
        String answer3= "3!";
        Question quest3 = new Question(question3,answer3);

// подготовка ожидаемого результата
        when(questionService.getAll()).thenReturn( Set.of(quest1,quest2,quest3));
        Set<Question> expectedList = new HashSet<>(List.of(quest1,quest2,quest3));
//   начало теста
        Collection<Question> actualList =  questionService.getAll();
        assertEquals(expectedList,actualList);

    }
}