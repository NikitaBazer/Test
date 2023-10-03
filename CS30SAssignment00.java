import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Nikita Bazer
 *  Class:          CS30S
 * 
 *  Assignment:     Assingment 0 
 * 
 *  Description:    Basic Programming Review Binary Conversion
 * 
 *************************************************************/

public class CS30SAssignment00 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        int exponent = 0;// variable for the exponent
        int total = 0;// variable for the sum of the math
   

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        BufferedReader fin = new BufferedReader(new FileReader("BinaryDataFile.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Nikita B" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Assignment 0" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing *****
        System.out.format("%-20s%-11s%s", "Base 2", "Base 10", nl);// print the titles for base 2 and base 10
        strin = fin.readLine();// priming the loop
        while (strin != null){
            //System.out.println(strin);
            total = 0;// set total to zero
            exponent = 0;// set exponent to zero
            for(int i = strin.length() - 1; i >= 0; i--){// run from right to left and to stop and move on to the next line when you reach the end
                if(strin.charAt(i) == '1'){// checking if the character is a 1 or a 0
                    total += Math.pow(2, exponent);// if the number is a 1 then we multiply it by the exponent
                }// end if
                exponent++;// add 1 to the exponent 
            }// end for

            //System.out.println(total);
            System.out.format("%-20s%-11s%s", strin, total, nl);// printing the base 2 numbers and the base 10 numbers
            // update loop
            strin = fin.readLine();// re-prime the loop
        }// end main while

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
