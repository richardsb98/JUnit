import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    Grader grader = new Grader();

    @Test
    void ThirtyFiveReturnsU() {
        Assertions.assertEquals('U', grader.determineLetterGrade(35), "Grade not equal to U");
    }

    @Test
    void FourtyFiveReturnsF() {
        Assertions.assertEquals('F', grader.determineLetterGrade(45), "Grade not equal to F");
    }

    @Test
    void FiftyNineReturnsD() {
        Assertions.assertEquals('D', grader.determineLetterGrade(59), "Grade not equal to D");
    }

    @Test
    void SixtyFiveReturnsC() {
        Assertions.assertEquals('C', grader.determineLetterGrade(65), "Grade not equal to C");
    }

    @Test
    void SeventyFiveReturnsB() {
        Assertions.assertEquals('B', grader.determineLetterGrade(75), "Grade not equal to B");
    }

    @Test
    void EightyFiveReturnsA() {
        Assertions.assertEquals('A', grader.determineLetterGrade(85), "Grade not equal to A");
    }

    @Test
    void EightyOneShouldReturnA() {
        Assertions.assertEquals('A', grader.determineLetterGrade(80));
    }
}
//    @Test
//    void InvalidGrade(){
//        Assertions.assertEquals("Number grade cannot be less than 0 or more than 100", , );
//    }
//
//}