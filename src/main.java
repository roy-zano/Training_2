import java.time.Clock;
import java.util.Scanner;

public class main {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            System.out.println("הכנס מספר");
            arr [i] = input.nextInt();
        }
    int a =1;
        System.out.println("הספרה 8 נמצאת במיקום " + findnam(arr,8)) ;
        System.out.println("המספר הכי גדול הוא " + max(arr)) ;
        System.out.println("המספר הכי קטן הוא " + min(arr)) ;
        System.out.println("הממוצע הוא " + avg(arr)) ;
        System.out.println("סכום המספרים הזוגיים הוא " + zugi(arr)) ;
        System.out.println("סכום המספרים האי זוגיים הוא " + yzugi(arr)) ;


        System.out.println("הכנס שני מספרים");
        int nam1 = input.nextInt();
        int nam2 = input.nextInt();

        System.out.println("הכנס פעולת חשבון");
        String sing = input.nextLine();

        calc(nam1,nam2,sing);
    }

    public static void calc (int nam1,int nam2,String sing){

        switch (sing){
            case "+":
                System.out.println(nam1+nam2) ;
                break;
            case "-":
                System.out.println(nam1-nam2) ;
                break;
            case "*":
                System.out.println(nam1*nam2) ;
                break;
            case "/":
                System.out.println(nam1/nam2) ;
                break;
        }
    }

    public static int max (int [] arrr){
        int n = arrr[0];
        for (int i = 0; i < arrr.length; i++ ){
            if (arrr[i]>n){
                n=arrr[i];
            }
        }
        return n;
    }

    public static int min (int [] arrr){
        int n = arrr[0];
        for (int i = 0; i < arrr.length; i++ ){
            if (arrr[i]<n){
                n=arrr[i];
            }
        }
        return n;
    }

    public static double avg (int [] arrr){
        int n = 0;
        for (int i = 0; i < arrr.length; i++ ){
            n=n+ arrr[i];
        }
        return n / arrr.length;
    }

    public static int zugi (int [] arrr){
        int n = 0;
        for (int i = 0; i < arrr.length; i++ ){
            if (arrr[i] % 2==0){
                n=n+arrr[i];
            }
        }
        return n ;
    }
    public static int yzugi (int [] arrr){
        int n = 0;
        for (int i = 0; i < arrr.length; i++ ){
            if (arrr[i] % 2!=0){
                n=n+arrr[i];
            }
        }
        return n ;
    }
    public static int findnam(int [] arrr,int nam){
        int i = 0;
        while (arrr[i] !=nam && i < arrr.length-1){
            i++;
        }
        if (i==arrr.length-1){
            if (arrr [i]==nam){
                return i;
            }
            else{
                return -1;
            }

        }else {
            return i;
        }
    }
}
