package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public Mail generateEmail() {
        return mailCode.generateEmail(client);
    }
}
