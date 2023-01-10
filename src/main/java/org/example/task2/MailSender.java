package org.example.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    private static final String SENDER_EMAIL = "oleksii.mytnyk@ucu.edu.ua";
    private static final String SENDER_NAME = "Oleksii Mytnyk";

    public static void sendMail(MailInfo info) throws MailjetSocketTimeoutException, MailjetException {
        Mail email = info.generateEmail();
        MailjetClient client = new MailjetClient(
                System.getenv("API_KEY"), System.getenv("API_SECRET"), new ClientOptions("v3.1"));
        MailjetRequest request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray().put(new JSONObject()
                        .put(Emailv31.Message.FROM, new JSONObject()
                                .put("Email", SENDER_EMAIL)
                                .put("Name", SENDER_NAME))
                        .put(Emailv31.Message.TO, new JSONArray().put(new JSONObject()
                                .put("Email", info.getClient().getEmail())
                                .put("Name", info.getClient().getName())))
                        .put(Emailv31.Message.SUBJECT, email.getSubject())
                        .put(Emailv31.Message.HTMLPART, email.getHtml_part())
                        .put(Emailv31.Message.TEXTPART, email.getText_part())
                        .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        MailjetResponse response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
