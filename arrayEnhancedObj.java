class Student{
    int rollNo;
    String name;
    int marks;
}
public class arrayEnhancedObj{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollNo=51;
        s1.marks=99;
        s1.name="Naman";

        Student s2 = new Student();
        s2.name="Gungun";
        s2.marks=78;
        s2.rollNo=29;

        Student s3 = new Student();
        s3.name="Vaibhavi";
        s3.marks=85;
        s3.rollNo=70;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student stud : students){
            System.out.println("roll number "+stud.rollNo +"  "+ stud.name +"  "+"got  "+ stud.marks +"  "+"marks" );
        }
    }
}