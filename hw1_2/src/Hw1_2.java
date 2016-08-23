/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float gpa=0;
        int i,all=0;
        for (i=0;i<credit.length;i++) {
            all += credit[i];
            gpa += (grade[i] * credit[i]);
        }
        return (float)  gpa/all;
    }

    public static void main(String[] args)
    {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %.2f\n", h.gpaCalculation(credit, grade));
    }
}
