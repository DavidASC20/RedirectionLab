import java.util.Scanner;
public class MakeStars {

    public static void main(String[] args) {
        String newLine = "";
        String temp = "";
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()){
            Scanner lineRead = new Scanner(System.in);
            while(lineRead.hasNext()){
                int x = lineRead.next().length();
                for(int i = 0; i < x - 1; i++){
                    temp += "*";
                }
                newLine += temp + " ";
            }
        }System.out.print(newLine);
    }
}
