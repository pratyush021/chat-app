package com.app.websocket.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HelloMessage {
    private String name;
    private String testing;
}
