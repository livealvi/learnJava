public class Student
{
    public String name ; // instance variable
    public String id ;
    private float cgpa;
    public String courses[] = new String[2];

    public Student() // default constructor
	{
		
	}

	public Student(String name, String id, float cgpa, String courses1, String courses2) // parameterized constructor ("test", "1-1", 3.0f)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.courses[0] = courses1;
        this.courses[1] = courses2;
    }

    /*
    public Student(float cgpa) // parameterized Constructor 
    {
    	this.cgpa = cgpa ;
    }
    
    public void setCgpa(float cgpa) // instance method
    {
    	this.cgpa = cgpa ;
    }
    
    public float getCgpa()
    {
        return this.cgpa;
    }
    */
    
    public void showInformation()
    {
        System.out.println("Name: "+this.name) ;
        System.out.println("ID: "+this.id) ;
        System.out.println("Cgpa: "+this.cgpa) ;
        System.out.println("Courses: "+this.courses[0]+ " and " +courses[1]) ;
    }


}