package org.example;

public class Main {
    public static void main(String[] args) {
        IDandPassword iDandPassword = new IDandPassword();
        System.out.println(iDandPassword.getLoginInfo());
        LoginPage loginPage = new LoginPage(iDandPassword.getLoginInfo());
    }
}