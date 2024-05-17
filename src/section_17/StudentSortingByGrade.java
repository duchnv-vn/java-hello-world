package section_17;

import java.util.Comparator;

public class StudentSortingByGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        var totalGradeComparision = Float.compare(o1.totalGrade, o2.totalGrade);

        if (totalGradeComparision == 0) {
            char lastIdNumber1 = o1.studentId.charAt(o1.studentId.length() - 1);
            char lastIdNumber2 = o2.studentId.charAt(o2.studentId.length() - 1);
            return Character.compare(lastIdNumber1, lastIdNumber2);
        }

        return totalGradeComparision;
    }

}
