class Student
{
	int rollno;
	int marks1;
	int marks2;
	int total;
	Student()
	{
	     rollno=0;
	     marks1=0;
	     marks2=0;
	     total=0;
	}

Student(int rollno, int marks1, int marks2)
{
	this.rollno=rollno;
	this.marks1=marks1;
	this.marks2=marks2;
}
 void setdata(int r, intm1, int m2)
{
	rollmo=r;
	marks1=m1;
	marks2=m2;
	total=marks1+marks2;
}
void process()
{
	total=marks1+marks2;
}
 void putdata()
 {
 	system.out.println("rollno="+rollno);
 	system.out.println("\tMarks="+marks1 +" Marks2="+marks2);
 	system.out.println("\tTotal="+total);

 }
}
class Studentexe2
{
	public static void main(String[] args) 
	{
		system.out.println("Welcome...");

		Student s1=new Student();
		s1.setdata(1, 50, 60);
		s1.putdata();

		Student s2=new Student();
		s2.putdata();
		
		Student s3=new Student(3, 80, 90);
		s3.process();
		s3.putdata();


	}
}