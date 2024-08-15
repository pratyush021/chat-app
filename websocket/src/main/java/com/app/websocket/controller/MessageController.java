package com.app.websocket.controller;

import com.app.websocket.model.Greetings;
import com.app.websocket.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greetings greeting2(HelloMessage message) throws Exception {
        Thread.sleep(1000);

        return new Greetings("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
