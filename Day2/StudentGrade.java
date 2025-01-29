package Day2;
import java.util.Scanner;

// public class StudentGrade {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the marks : ");
//         int marks = sc.nextInt();
//         if(marks >= 75){
//             System.out.println("Result : Distinction");
//         }
//         else if(marks > 40 && marks < 75){
//             System.out.println("Result : Pass");
//         }
//         else{
//             System.out.println("Result : Fail");
//         }

//     }
    
// }

// Second way using interface 

// interface GradeCalculator {
//     void calculateGrade(String name, int marks);
// }

// class Student implements GradeCalculator {
//     @Override
//     public void calculateGrade(String name, int marks) {
//         System.out.print("Name: " + name + ":- Result: ");
//         if (marks >= 75) {
//             System.out.println("Distinction");
//         } else if (marks > 40 && marks < 75) {
//             System.out.println("Pass");
//         } else {
//             System.out.println("Fail");
//         }
//     }
// }

// public class StudentGrade {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

    
//         System.out.print("Enter the number of students: ");
//         int n = sc.nextInt();

//         GradeCalculator student = new Student();

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter name of student " + (i + 1) + ": ");
//             String name = sc.next(); // Read name
//             System.out.print("Enter marks of " + name + ": ");
//             int marks = sc.nextInt(); // Read marks
//             student.calculateGrade(name, marks); // Call the method to print the result
//         }
//     }
// }

// public class StudentGrade {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the marks of Maths : ");
//         float Maths = sc.nextFloat();
//         System.out.print("Enter the marks of Science : ");
//         float Science = sc.nextFloat();
//         System.out.print("Enter the marks of English : ");
//         float English = sc.nextFloat();
//         System.out.print("Enter the marks of SST : ");
//         float SST = sc.nextFloat();
//         float Percentage = (Maths+Science+English+SST)*100/400;
//         System.out.println(Percentage);
//          if (Percentage >= 75) {
//             System.out.println("Distinction");
//         } else if (Percentage > 40 ) {
//             System.out.println("Pass");
//         } else {
//             System.out.println("Fail");
//         }

//     }
// }

// public class StudentGrade {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

      
//         System.out.print("Enter the number of students: ");
//         int n = sc.nextInt();
//         for (int i = 1; i < n; i++) {
    
//             System.out.print("Enter the name of student " +  ": ");
//             String name = sc.next();
//             System.out.print("Enter the marks of Maths: ");
//             float Maths = sc.nextFloat();
//             System.out.print("Enter the marks of Science: ");
//             float Science = sc.nextFloat();
//             System.out.print("Enter the marks of English: ");
//             float English = sc.nextFloat();
//             System.out.print("Enter the marks of SST: ");
//             float SST = sc.nextFloat();
//              // Calculate percentage
//             float Percentage = (Maths + Science + English + SST) / 4;
//             System.out.println("Student Name: " + name + " Percentage: " + Percentage);
            
//             if (Percentage >= 75) {
//                 System.out.println("Grade: Distinction");
//             } else if (Percentage > 40) {
//                 System.out.println("Grade: Pass");
//             } else {
//                 System.out.println("Grade: Fail");
//             }

//             System.out.println("------------------------------");
//         }

        
//     }
// }

public class StudentGrade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the no of Student: ");
            int n = sc.nextInt();
            String[] SN = new String[n];
          
            float[][] Marks = new float[n][4];
            for(int i=0;i<n;i++){
                System.out.print("Enter the name of Student: ");
                SN[i] = sc.next();

                System.out.println("Enter the marks of Maths: ");
                Marks[i][0]= sc.nextFloat();
                System.out.println("Enter the marks of Science: ");
                Marks[i][1]= sc.nextFloat();
                System.out.println("Enter the marks of English: ");
                Marks[i][2] = sc.nextFloat();
                System.out.println("Enter the marks of Hindi: ");
                Marks[i][3]= sc.nextFloat();

            }
            for(int i =0;i<n;i++){
                float total = Marks[i][0]+Marks[i][1]+Marks[i][2]+Marks[i][3];
                float Percentage = total/4;
                System.out.println("Name : "+ SN[i]);
                System.out.println("Percentage : "+ Percentage);
                if (Percentage >= 75) {
                      System.out.println("Grade: Distinction");
                    } else if (Percentage > 40) {
                                System.out.println("Grade: Pass");
                                 } else {
                                    System.out.println("Grade: Fail");
                                }
                    
                                System.out.println("------------------------------");
                            }
            }
        }
    




