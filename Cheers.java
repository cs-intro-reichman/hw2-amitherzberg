// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	
                String word = args[0].toUpperCase();
                int returns = Integer.parseInt(args[1]);
                String anLetters = "AEFHILMNORSX"; 
                
                for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        boolean isAn = false;
                        for (int j=0; j < anLetters.length(); j++) {
                                if (ch == anLetters.charAt(j)) {
                                     isAn = true;
                                     break; 
                                } 
                                
                        } 
                        if (isAn) {
                                System.out.println("Give me an " + ch + ": " + ch + "!");
                        } else {
                                System.out.println("Give me a " + ch + ": " + ch + "!");
                        }
                }  
                for (int i = 1; i <= returns; i++) {
                        System.out.println("What does that spell? " + word + "!" + "!" + "!");
                }
        }
 }

 
 


