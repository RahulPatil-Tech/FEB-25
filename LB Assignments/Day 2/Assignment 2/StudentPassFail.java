public class StudentPassFail {
    public static void main(String[] args) {
        int subject1 = 45; 
        int subject2 = 39;
        int subject3 = 42;
        int failedSubjects = 0;
        if (subject1 < 40) {
            failedSubjects++;
        }

        if (subject2 < 40) {
            failedSubjects++;
        }

        if (subject3 < 40) {
            failedSubjects++;
        }
        if (failedSubjects > 0) {
            System.out.println("The student has failed " + failedSubjects + " subject(s).");
        } else {
            System.out.println("The student has passed in all subjects.");
        }
    }
}

