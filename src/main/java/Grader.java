public class Grader {

    public char determineLetterGrade (int numberGrade) {
        if (numberGrade < 0 | numberGrade > 100) {
           throw new IllegalArgumentException("Number grade cannot be less than 0 or more than 100");
        }
        else if (numberGrade < 40){
            return 'U';
        }
        else if (numberGrade < 50 & numberGrade >= 40){
            return 'F';
        }
        else if (numberGrade < 60 & numberGrade >= 50){
            return 'D';
        }
        else if (numberGrade < 70 & numberGrade >= 60){
            return 'C';
        }
        else if (numberGrade < 80 & numberGrade >= 70){
            return 'B';
        }
        else {
            return 'A';
        }

    }
}

