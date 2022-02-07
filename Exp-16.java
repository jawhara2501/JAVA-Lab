package sample;


import java.lang.*;
		import java.util.Scanner;

		public class Experiment16final implements CharSequence  {
		    private String s;
		    public Experiment16final(String s) {
		        this.s = s;
		    }
		    private int fromEnd(int i)
		    {
		        return s.length() - 1 - i;
		    }

		    public char charAt(int i)
		    {
		        if ((i < 0) || (i >= s.length()))
		        {
		        throw new StringIndexOutOfBoundsException(i);
		        }
		        return s.charAt(fromEnd(i));
		    }

		    public int length()
		    {
		        return s.length();
		    }

		    public CharSequence subSequence(int start, int end)
		    {
		        if (start < 0) {
		        throw new StringIndexOutOfBoundsException(start);
		        }
		        if (end > s.length())
		        {
		        throw new StringIndexOutOfBoundsException(end);
		        }
		        if (start > end)
		        {
		        throw new StringIndexOutOfBoundsException(start - end);
		        }
		        StringBuilder sub =
		        new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
		        return sub.reverse();
		    }

		    public String toString() {
		        StringBuilder s = new StringBuilder(this.s);
		        return s.reverse().toString();
		    }
		    public static void main(String[] args)
		    {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the string : ");
		        String str = sc.nextLine();
		        Experiment16final s = new Experiment16final(str);
		        System.out.println("reverse = "+s);

		    }
		}
