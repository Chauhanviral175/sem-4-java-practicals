class student{
        int Enroll;
        String name;
        void output(String name, int Enroll){
            System.out.println("Student Name:"+name +"\nStudent Enrollment Number:"+Enroll+"\n");
        }
        public static void main(String args[]){
            student s1 = new student();
            student s2 = new student();
            student s3 = new student();
            s1.output("viral",25);;
            s2.output("abhi",44);
            s3.output("krish",36);
        }
}