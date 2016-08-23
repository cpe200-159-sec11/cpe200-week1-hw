/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        int round = credit.length ,sum_g=0 ,sum_c=0;
        for(int i=0; i<round; i++)
        {
           sum_g = sum_g+(grade[i]*credit[i]);
            sum_c = sum_c+credit[i];
        }
        return sum_g/sum_c;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
