package java_interviews.companies_based_questions.solutions;

public class Q_24_Roots_Quadratic_Equation {
    public static void main(String agrs[]){
       double a=1, b=-3 , c=2;

       findRoots(a,b,c);
    }

    public static void findRoots(double a,double b,double c){
        if(a==0){
           System.out.println("Not a quadratic equation (a cannot be 0).");
            return; 
        }

        double d= (b*b)-(4*a*c);

        if(d>0){
            double root1= (-b + Math.sqrt(d)) /(2*a);
            double root2= (-b - Math.sqrt(d)) /(2*a);
            System.out.println("Roots are Real and Distinct: \n" + root1 + ", " + root2);
        }else if(d==0){
              double root= (-b + Math.sqrt(d)) /(2*a);
              System.out.println("Roots are Real and Equal: " + root);
        }else{
            System.out.println("Roots are Imaginary (Complex Numbers).");
        }
    }
}

