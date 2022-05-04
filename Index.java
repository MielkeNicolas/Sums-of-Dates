import java.util.*;

public class Index {

    public static void main (String[] args){
        String aDate;
        int bDate = 0;
        short aSumm, bSumm, cSumm;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи потрібну дату (без розділових символів): ");
        aDate = in.nextLine();
        if ((!aDate.equals("")) && (new Scanner(aDate).hasNextInt())) {
            System.out.println("Значення!");
            bDate = Integer.parseInt(aDate);
        }
        else{
            System.out.println("При введенні дати зроблено помилку!");
        }
        System.out.println(bDate);
    }

}
