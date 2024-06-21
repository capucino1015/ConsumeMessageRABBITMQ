package com.example.tugas2_agit_agnasyanabilaputrimain;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    private static final String queue = "nasyaQueue";

    @RabbitListener(queues = queue)
    public void processMessage(String message) {
        System.out.println("Pesan dari RabbitMQ: " + message);
    }

}
