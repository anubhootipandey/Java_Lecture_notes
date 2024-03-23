import java.util.Scanner;
class NestedIfElse {
    public static void main(String[] args) {
        char grade;
        int marksObtained, passingMarks;
        Scanner input = new Scanner(System.in);
        passingMarks = 40;
        marksObtained = input.nextInt();
        System.out.println("Input marks scored by you");
        if (marksObtained >= passingMarks) {
            if (marksObtained > 90)
                grade = 'A';
            else if (marksObtained > 75)
                grade = 'B';
            else if (marksObtained > 60)
                grade = 'C';
            else
                grade = 'D';   

            System.out.println("You passed the exam and your grade is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed and your grade is " + grade);
        }
    }
}
        

