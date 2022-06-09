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
        Assertions.assertEquals('D', grader.determineLetterGrade(55), "Grade not equal to D");
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



    ////////////////////////////// Boundary Tests //////////////////////////////////////////////////////////////////////////

    @Test
    void EightyShouldReturnA() {
        Assertions.assertEquals('A', grader.determineLetterGrade(80));
    }

    @Test
    void SeventyShouldReturnB(){
        Assertions.assertEquals('B', grader.determineLetterGrade(70), "Boundary not correct");
    }

    @Test
    void SixtyShouldReturnC(){
        Assertions.assertEquals('C', grader.determineLetterGrade(60), "Boundary not correct");
    }

    @Test
    void FiftyShouldReturnD(){
        Assertions.assertEquals('D', grader.determineLetterGrade(50), "Boundary not correct");
    }

    @Test
    void FourtyShouldReturnF(){
        Assertions.assertEquals('F', grader.determineLetterGrade(40), "Boundary not correct");
    }

    @Test
    void SeventyShouldReturnU(){
        Assertions.assertEquals('U', grader.determineLetterGrade(39), "Boundary not correct");
    }
}
//    @Test
//    void InvalidGrade(){
//        Assertions.assertEquals("Number grade cannot be less than 0 or more than 100", , );
//    }
//
//}