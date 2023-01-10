package org.example.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Mail {
    private String subject;
    private String html_part;
    private String text_part;
}
