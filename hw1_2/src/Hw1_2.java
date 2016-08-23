/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float sum_grade=0;
        float sum_credit=0;
        for(int num=0;num<credit.length;num++) {
            sum_grade = sum_grade + (grade[num] * credit[num]);
            sum_credit = sum_credit + credit[num];
        }
        return sum_grade/sum_credit;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
