import java.util.*;
class gradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking inputs of six subjects
        System.out.print("Enter the marks of subject 1(out of 100): ");
        int m1=sc.nextInt();
        System.out.print("Enter the marks of subject 2(out of 100): ");
        int m2=sc.nextInt();
        System.out.print("Enter the marks of subject 3(out of 100): ");
        int m3=sc.nextInt();
        System.out.print("Enter the marks of subject 4(out of 100): ");
        int m4=sc.nextInt();
        System.out.print("Enter the marks of subject 5(out of 100): ");
        int m5=sc.nextInt();
        System.out.print("Enter the marks of subject 6(out of 100): ");
        int m6=sc.nextInt();
        float totalMarks=m1+m2+m3+m4+m5+m6;
        float avgPercentage=totalMarks/6;
        String grade;

        if(avgPercentage >= 90) grade="A+";
        else if(avgPercentage >=80 && avgPercentage <=89) grade="A";
        else if(avgPercentage >=70 && avgPercentage<=79) grade="B+";
        else if(avgPercentage>=60 && avgPercentage<=69) grade="B";
        else if(avgPercentage>=50 && avgPercentage<=59) grade="C";
        else if(avgPercentage>=40 && avgPercentage<=49) grade="D";
        else grade="FAIL";

        System.out.println("The student deatils are: ");
        System.out.println("The total marks of student: "+totalMarks);
        System.out.println("The average percentage of student: "+avgPercentage);
        System.out.println("The grade of student is: "+grade);

        sc.close();


    }
}