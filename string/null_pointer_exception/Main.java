package com.example;

public class Main {
    public static void validateEmails(String[] emails) {
        for (String goodEmail: emails) {
            if (goodEmail != null && goodEmail.contains("@")) {
                System.out.println(goodEmail);
            } else {
                System.out.println("Invalid or missing email");
            }
        }
    }

    public static void main(String[] args) {
        String[] employeeEmails = {"alice@company.com", null, "bob@company.com", null, "charlie@company.com"};

        validateEmails(employeeEmails);
    }
}