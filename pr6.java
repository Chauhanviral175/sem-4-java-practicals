import java.util.Scanner;
class student{
        int Enroll;
        String name;
        void input(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Student Name:");
            name=sc.nextLine();
            System.out.println("Enter Student Enrollment No:");
            Enroll=sc.nextInt();
        }
        void display(){
            System.out.println("Student Name:"+name+"\nStudent Enrollment No:"+Enroll+"\n");
        }
        public static void main(String args[]){
            student s1 = new student();
            student s2 = new student();
            student s3 = new student();
            s1.input();
            s2.input();
            s3.input();
            s1.display();
            s2.display();
            s3.display();
        }
}
