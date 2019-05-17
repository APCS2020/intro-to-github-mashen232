import java.util.Scanner;

public class tools{
    public static void printLine(int num,String str){
        for (int i=0; i < num; i++){
            System.out.print(str);
        }
        System.out.println();
    }
    public static void printSquare(int num, String str){
        for(int i = 0;i < num; i++){
            printLine(num,str);
        }
    }
    public static void printRectangle(int num, String str){
        for(int i = 0;i < num; i++){
            printLine(num,str);
        }
    }
    public static int getInt(){
        System.out.println("Enter an Integer");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static int getInt(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static String getStr(){
        System.out.println("Enter a String");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
// public : 范围
// static : class method, className. toolsName()
//String the type of return, void :non return
//getstr : methodName
//(String str): parameter list,(int x, int y, String str)
//(int x) <> (int a)
//@param str
//@return