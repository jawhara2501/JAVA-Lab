import java.io.*;
public class EXP24_CountEverything {
    public static void main(String args[]) throws IOException,FileNotFoundException {
        FileReader fin=new FileReader("TextFiles\\file1.txt");
        int chr=0,lines=0,words=0;
        int c=fin.read();
        while(c!=-1){
            
            if(c==32)
                words++;
            else if(c==10)
                lines++;
            else
                chr++;   
            c=fin.read();            
        }
        System.out.println("No of:-\nCharacters: "+chr+"\nLines: "+Math.min(chr,lines+1)+"\nWords: "+Math.min(chr,words+1));
        fin.close();
        

    }
}
