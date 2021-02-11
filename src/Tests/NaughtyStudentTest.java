package Tests;

import com.NaughtyStudent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        NaughtyStudent naughtyStudent = new NaughtyStudent(Arrays.asList(4.5,5.5,6.5,7.5)); //6.6

//        assertTrue(naughtyStudent instanceof Student);
        Assertions.assertNotEquals(6, naughtyStudent.getAverageGrade());
    }
}