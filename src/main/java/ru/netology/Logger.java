package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    private int num = 1;
    private static Logger logger;

    private Logger() { };

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        String dateFormat =  new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("[" + dateFormat + " " + num++ + "] " + msg);
    }
}
