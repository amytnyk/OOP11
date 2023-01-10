package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import org.example.task1.Gender;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailBox mailBox = new MailBox();
        Client client = new Client("Alex", 18, Gender.MALE, "oleksii.mytnyk@ucu.edu.ua");
        MailInfo mailInfo = new MailInfo(MailCode.GREET, client);
        mailBox.addMailInfo(mailInfo);
        mailBox.sendAll();
    }
}
