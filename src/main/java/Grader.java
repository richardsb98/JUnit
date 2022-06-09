public class Grader {

    public char determineLetterGrade (int numberGrade) {
        if (numberGrade < 0 | numberGrade > 100) {
            String InvalidScore = "Invalid Score";
            System.out.println(InvalidScore);
        }
        else if (numberGrade < 40){
            return 'U';
        }
        else if (numberGrade < 50){
            return 'F';
        }
        else if (numberGrade < 60){
            return 'D';
        }
        else if (numberGrade < 70){
            return 'C';
        }
        else if (numberGrade < 80){
            return 'B';
        }
        else if (numberGrade < 90){
            return 'A';
        }

    }
}

