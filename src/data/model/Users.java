package data.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Data

public class Users {
    @NonNull
    @Getter
    @Setter
    private String fName;
    @Getter
    @NonNull
    @Setter
    private String lName;
    @Getter
    @Setter
    @NonNull
    private String fNumber;
    @Getter
    @Setter
    @NonNull
    private String password;
    @Getter
    @Setter
    @NonNull
    private String email;


    public Users(String firstName, String lastName, String email, String password) {
    }
}