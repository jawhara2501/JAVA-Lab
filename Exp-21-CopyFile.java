import java.io.*;

public class EXP21_CopyFiles {
    public static void main(String args[]) throws IOException{
        try{
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            FileInputStream fin=new FileInputStream("TextFiles\\file1.txt");
            System.out.println("file1 opened");
            
            FileOutputStream fout=new FileOutputStream("TextFiles\\file2.txt");
            System.out.println("file2 opened");
            
            int s=fin.read();
            while(s!=-1){
                fout.write(s);
                s=fin.read();
            }
            fin.close();fout.close();
            System.out.println("File data copied and file objects closed");      
        }catch (FileNotFoundException fne){
            System.out.println(fne);
        }

        
    }
}
