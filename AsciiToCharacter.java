public class AsciiToCharacter 
{

   public static void main(String[] args) 
   {
      char c;  //Character Variable Declaration
      for(int i=65;i<=90;i++) //Loop for printing A to Z character
      {
         c =(char)i; //Converting ASCII value to Character
         System.out.println(i+"  =  "+c); //Displaying ASCII value and its equivalent Character
      }
   }

}
