package view;


import entities.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu (Scanner scanner, ArrayList<Account> accounts, AccountService service ){
        String chooseContinue ="";
        do {
            System.out.println("====== Login Trang web ======");
            System.out.println("1- Dang Nhap");
            System.out.println("2- Dang ky");
            System.out.println("Please choose: ");
            menuSelect(accounts, service, scanner);
            System.out.println("DO y want to continue?(Y/N)");
            chooseContinue = scanner.nextLine();
        }while (chooseContinue.equalsIgnoreCase("y"));
    }

    public void menuSelect(ArrayList<Account>accounts, AccountService service, Scanner scanner){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 2: service.creatAccount(scanner, accounts);
                break;
            case 1: service.loginAccount(scanner,accounts);
                break;
            default:
                System.out.println("ko có lệnh này");
        }

    }

}
