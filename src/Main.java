import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите с: ");
        int c = in.nextInt();
        System.out.print("Введите x: ");
        int x = in.nextInt();

        //task 1
        System.out.println("Задание 1");
        if ((a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0)) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            if (b % 2 == 0) {
                System.out.println(b);
            }
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }else{
            System.out.println("ни одно число не делится на 2");
        }
        System.out.println("______________________________________________________________________");
        //task 2
        System.out.println("Задание 2");
        if ((a % 2 == 0 ) || (b % 2 == 0 ) || (c % 2 == 0)) {
            if ( a%5 == 0) {
                System.out.println(a);
            }
            if (b%5==0) {
                System.out.println(b);
            }
            if (c%5==0) {
                System.out.println(c);
            }else{
                System.out.println("нет чисел которые делятся на 2 и на 5");
            }
            //task 3
            System.out.println("______________________________________________________________________");
            System.out.println("Задание 3");
            int result =15/x;
            System.out.println("x= "+x);
            switch (result){
                case 3:
                    if(x==5) {
                        System.out.println("X результат деления равен 3");
                    }else{
                        double m =(double) 15/x;
                        System.out.println("Результат деления 15/x равен дробному числу: "+m);
                    }
                    break;
                case 5:
                    System.out.println("X результат деления равен 5");
                    break;
                default:
                    double m =(double) 15/x;
                    System.out.println("Результат деления 15/x равен дробному числу: "+m);
            }
        }
    }}
