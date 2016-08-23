/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float result = 0;
        float result1 = 0;
        float result2 = 0;
        for(int i=0;i<credit.length;i++){
            result1 = result1+(grade[i]*credit[i]);
        }
        for(int j=0;j<credit.length;j++){
            result2 = result2 + credit[j];
        }
        result = result1/result2;
        return result;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
