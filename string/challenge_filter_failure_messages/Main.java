package com.example;

public class Main {
    public static String[] extractFailureLogs(String[] logs) {
        int count = 0;
        for (String message : logs) {
            if (message.toLowerCase().contains("failure")) {
                count++;
            }
        }

        String[] errorLogs = new String[count];
        int index = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].toLowerCase().contains("failure")) {
                errorLogs[index++] = logs[i];
            }
        }
        return errorLogs;
    }

    public static void main(String[] args) {
        String[] logs = {
                "System started successfully",
                "Failure: Disk space is low",
                "User logged in",
                "Warning: High CPU usage",
                "Failure: Unable to connect to server",
                "Backup completed"
        };

        String[] filtered = extractFailureLogs(logs);

        System.out.println("Messages containing the keyword 'failure':");
        for (String log : filtered) {
            System.out.println(log);
        }
    }
}
