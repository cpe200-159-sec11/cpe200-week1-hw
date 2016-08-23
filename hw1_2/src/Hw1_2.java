/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        int acredit=0;
        int sum=0;
        float gpa=0;
        for (int i=0;i<credit.length;i++){
            gpa+=grade[i]*credit[i];
            acredit+=credit[i];
        }


        /**
         * your code here
         */
        return gpa/acredit;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
