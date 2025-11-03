package module07._3accessor;

public class Student 
{
    private String name;
    private String email;
    private int id;
    
    public Student(String initName, String initEmail, int initId)
    {
       name = initName;
       email = initEmail;
       id = initId;
    }
    
    // toString() method
    public String toString() 
    { 
      return id + ": " + name + ", " + email;
    }
    
    //getter
    public int getID() {
      return id;
    }

    // setter
    public void setID(int newID) {
      id = newID;
    }

    // main method for testing
    public static void main(String[] args)
    {
       Student s1 = new Student("Skyler", "skyler@sky.com", 123456);
       System.out.println(s1);
       Student s2 = new Student("Tess", "e.l.mantineo@wustl.edu", 532050);
       System.out.println(s2);

       // s2.id = 53234; not possible!

       // you cannot do System.out.println(s1.id) because it is in another class and is private, but you can using
       System.out.println(s2.getID());
       // if you make it public, then anyone can also change or modify it
    }
 }
