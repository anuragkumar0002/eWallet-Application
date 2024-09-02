package com.eWallet.common;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCreatedPayload {
    private Long userId;
    private String userName;
    private String userEmail;
}
