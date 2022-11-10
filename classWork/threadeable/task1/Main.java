package threadeable.task1;

import java.util.Scanner;

// понять задачу и переделать!

public class Main {



    public static void main(String[] args) {

        Main task1 = new Main();
        int bank = 100_000;
        int sum = bank - task1.getMoney(bank);
        task1.showBankValue(sum);

    }

    public int getMoney (int bank){
        int getMoney = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько денег снять: ");
        getMoney = sc.nextInt();

        return getMoney;

    }



    public void showBankValue(int bank){
        System.out.println("На счёте осталость: " + bank);
    }
}
