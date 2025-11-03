package module07._1parts;

public class Riddle
{
   // write 2 instance variables for Riddle's question and answer: private type variableName;
   private String Question;
   private String Answer;
   
   // constructor
   public Riddle(String initQuestion, String initAnswer)
   {
      // set the instance variables to the init parameter variables
      Question = initQuestion;
      Answer = initAnswer;
   }
   
   // Print riddle question
   public void printQuestion()
   {
     // print out the riddle question with System.out.println
      System.out.println("The riddle question is " + Question);
   }
   
   // Print riddle answer
   
   public void printAnswer()
   {
     // print out the riddle answer with System.out.println
      System.out.println("The answer to the riddle is " + Answer);
   }
   
   // main method for testing
   public static void main(String[] args)
   {
      // call the constructor to create 2 new Riddle objects
      Riddle q1 = new Riddle("Why did the chicken cross the road?", "To get to the otherside");
      q1.printQuestion();
      q1.printAnswer();
      Riddle q2 = new Riddle("How do you get a tissue to dance?", "You put a little boogy in it!");
      q2.printQuestion();
      q2.printAnswer();
      // call their printQuestion() and printAnswer methods
     
   }
}
