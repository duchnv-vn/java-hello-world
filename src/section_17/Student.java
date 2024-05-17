package section_17;

import java.text.MessageFormat;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    String studentId;
    String className;
    float totalGrade;

    public Student(String firstName, String lastName, String studentId, String className, float totalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.className = className;
        this.totalGrade = totalGrade;
    }

    @Override
    public String toString() {
        String format = """
                ----------------------------
                Student ID: {0} | Name: {1} {2} | Class: {3} | Total grade: {4}
                ----------------------------
                    """;

        return MessageFormat.format(format, studentId, firstName, lastName, className, totalGrade);
    }

    @Override
    public int compareTo(Student student) {
        var totalGradeComparision = Float.compare(this.totalGrade, student.totalGrade);

        if (totalGradeComparision == 0) {
            char lastIdNumber1 = this.studentId.charAt(this.studentId.length() - 1);
            char lastIdNumber2 = student.studentId.charAt(student.studentId.length() - 1);
            return Character.compare(lastIdNumber1, lastIdNumber2);
        }
        return totalGradeComparision;
    }
}
