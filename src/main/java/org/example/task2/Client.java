package org.example.task2;

import lombok.*;
import org.example.task1.Gender;

@Getter
@RequiredArgsConstructor
public class Client {
    @Generated
    private int id;
    @Setter @NonNull
    private String name;
    @Setter @NonNull
    private int age;
    @Setter @NonNull
    private Gender sex;
    @Setter @NonNull
    private String email;
}
