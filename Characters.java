public class Characters {
        public static void main(String[] args) {
                char H = 'H';
                char e = 'e';
                char l = 'l';
                char o = 'o';
                char exclamation = '!';
                
                System.out.println(H + e + l + l + o + exclamation);
                
                // Characters uses ASCII encoding for the values 0-127
                char a = 64;
                System.out.println("A char with a value of 64 is " + a);
                
                H = 72;
                e = 101;
                l = 108;
                o = 111;
                exclamation = 33;
                
                // A very awful way of printing characters. Without the quotes, the println() function
                // treats the chars as integers, and adds up their values rather than printing them.
                System.out.println(H + "" + "" + e + "" + "" + l + "" + "" + l + "" + o + "" + exclamation);
                
                
                char[] letters = new char[6];
                letters[0] = H;
                letters[1] = e;
                letters[2] = l;
                letters[3] = l;
                letters[4] = o;
                letters[5] = exclamation;
                
                // The String class has a number of ways to initialize the object,
                // one of which is creating the String from an array of characters.
                String word = new String(letters);
                System.out.println(word);
                
                // Try to write out, step by step, the logic of what is happening here.
                for (int index = 0; index < letters.length; index++) {
                        if (letters[index] != word.charAt(index)) {
                                System.out.println("The strings aren't identical at " + index);
                                // What is this return statement doing?
                                return;
                        }
                }
                
                System.out.println("The two strings are identical!");
                
        }
}
