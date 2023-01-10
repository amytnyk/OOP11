package org.example.task2;

public enum MailCode {
    GREET {
        @Override
        public Mail generateEmail(Client client) {
            return Mail.builder()
                    .subject("Greetings " + client.getName())
                    .html_part("<h1>Greetings!!!</h1>")
                    .text_part("Text of the greeting")
                    .build();
        }
    }, LETTER {
        @Override
        public Mail generateEmail(Client client) {
            return Mail.builder()
                    .subject("Letter to " + client.getName())
                    .html_part("<h1>Some letter</h1>")
                    .text_part("Text of the letter")
                    .build();
        }
    }, BILL {
        @Override
        public Mail generateEmail(Client client) {
            return Mail.builder()
                    .subject("Bill to " + client.getName())
                    .html_part("<h1>Bill</h1>")
                    .text_part("Text of the BILL")
                    .build();
        }
    };

    public abstract Mail generateEmail(Client client);
}
