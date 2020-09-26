import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
/* 
*Lexical analyzer example
*https://www.concretepage.com/java/java-streamtokenizer-example
*
*StreamTokenizer oracle docs
*
https://docs.oracle.com/javase/7/docs/api/java/io/StreamTokenizer.html
*/


class Main {

  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader("first_test.txt");
    StreamTokenizer st = new StreamTokenizer(fileReader);
    while(st.nextToken() != StreamTokenizer.TT_EOF) { 
			if(st.ttype == StreamTokenizer.TT_WORD) { 
				System.out.println("Lexeme: "+st.sval);
			} else if(st.ttype == StreamTokenizer.TT_EOL) {
				System.out.println("--End of Line--"); 
			}
		} 

    System.out.println("End of program and lol");
	}

  

}