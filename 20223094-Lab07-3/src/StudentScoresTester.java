import java.util.Scanner;

public class StudentScoresTester {
	public static void main(String[] args) {
		StudentScores studSc = new StudentScores();
		Student[] students = new Student[100];
		Scanner in = new Scanner(System.in);
		boolean done = false;
		int studentsNum = 0;
		// Read the students names and scores, and add them to studSc
		do {
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			if (name.equals("-1"))
				done = true;
			else {
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine(); // skip the end-of-line character
				/** Your code goes here */
				students[studentsNum] = new Student(name, score);
				studSc.add();
				studentsNum ++;
			}
		} while (!done);

		// Find the students with highest and lowest scores and print
		// their names and scores
		/** And here */
		System.out.println(studSc.getHighest(students));
		System.out.println(studSc.getLowest(students));
		in.close();
	}

}
