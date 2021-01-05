import java.util.Scanner;

import javax.swing.text.Style;
public class MakeStars {

    public static void main(String[] args) {
        String newLine = "";
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            Scanner lineRead = new Scanner(input.nextLine());
            while(lineRead.hasNext()){
                String temp = "";
                // System.out.println(lineRead.next());
                int x = lineRead.next().length();
                for(int i = 0; i < x; i++){
                    temp += "*";
                }
                // System.out.println(temp);
                newLine += temp + " ";

            }System.out.println(newLine);
                newLine = "";
        }
    }
}
