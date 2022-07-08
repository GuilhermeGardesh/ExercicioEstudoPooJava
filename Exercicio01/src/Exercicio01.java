import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Exercicio01 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat();
        Calendar cal = Calendar.getInstance();
        Date data = cal.getTime();



        SimpleDateFormat f = (SimpleDateFormat) SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG);
        System.out.println(f.format(data));






    }
}
