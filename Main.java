// 20220922: I've considered your comments that I've pasted below. I agree the tests only want you to print the resulting lines - that is, the uppercased lines. But, if you look really close, the only change you need is to comment out line 26. Fix and I'll regrade.

// Does NOT pass the input and output tests and I'd like to explain why:
// 1. The markdown page looks different from the tests. As the markdown shows both the orginal input AND the capitalized version
// 2. There is some newline issues due to the above
// 3. The loop will end when phrase = "quit" but ONLY when typed that way. Capitalization matters.


//Ashley Grafner
//CSC 1060680, Computer Science 1 (Java)
//9/8/2022
//This program will read a line and print that line in all caps until it reaches a line containing only the word 'quit'.

import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      System.out.println(""); //This is where you input a phrase
      String phrase = input.nextLine();
    
  while (phrase.equals ("quit")!=true){ //will loop always until phrase = quit
      String upper = phrase.toUpperCase();//converts ALL to uppercase
      System.out.println(upper);
 
      phrase = input.nextLine();
        
        }
    }
  }

//Fixed the Input/Output tests! Please re-grade
