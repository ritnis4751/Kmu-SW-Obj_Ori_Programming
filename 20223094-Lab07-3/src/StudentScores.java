
public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private int numStudents;

	public StudentScores() {
		numStudents = 0;
	}

	public void add() {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		numStudents++;
	}

	public String getHighest(Student[] students) {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 0; i < numStudents; i++)
			if (students[i].getScore() > students[highest].getScore())
				highest = i;

		return "The highest student: " + students[highest].getName() + " Score: " + students[highest].getScore();
	}

	public String getLowest(Student[] students) {
		if (numStudents == 0)
			return null;
		
		int lowest = 0;

		for (int i = 0; i < numStudents; i++)
			if (students[i].getScore() < students[lowest].getScore()){
				lowest = i;
			}

		return "The lowest student: " + students[lowest].getName() + " Score: "  + students[lowest].getScore();
	}
}
