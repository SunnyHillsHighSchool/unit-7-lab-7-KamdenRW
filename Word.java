//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?

   //add an instance variable
private String s;
	//create a constructor
	public Word()
  {
    s = "";
  }

  public Word(String str)
  {
    s = str;
  }

//Getter method
public String getWord()
{
  return s;
}

//Setter method
public void setWord(String n)
{
  s = n;
}

//getNumVowels
public int getNumVowels(){

    int x = 0;
    for (int i = 0; i < s.length(); i++) {
      if ( vowels.indexOf(s.charAt(i)) >= 0 ){
        x++;
      }
       
    }
  return x;
}


//getLength
	
public int getLength(){

  return s.length();

}

	//create a toString method
public String toString()
{
  return ""+ s;
}

}