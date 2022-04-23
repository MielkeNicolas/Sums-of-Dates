import java.util.*;

public class Index {

    public static void main (String[] args){
        String aDate;
        int bDate;
        short aSumm, bSumm, cSumm;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи потрібну дату (без розділових символів): ");
        aDate = in.nextLine();
        if (!aDate.equals("")){
            System.out.println("Значення!");
        }
        else{
            System.out.println("Ви нічого не ввели!");
        }
        System.out.println(aDate);
    }

}
