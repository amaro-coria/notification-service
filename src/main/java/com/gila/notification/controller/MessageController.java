package com.gila.notification.controller;

import com.gila.notification.api.MessageApi;
import com.gila.notification.api.model.AddMessageRequest;
import com.gila.notification.api.model.AddMessageResponse;
import com.gila.notification.api.model.LogMessageResponse;
import com.gila.notification.api.model.Message;
import com.gila.notification.common.dto.MessageLogDto;
import com.gila.notification.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@RestController
@CrossOrigin(origins = "*")
public class MessageController implements MessageApi {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public ResponseEntity<AddMessageResponse> addMessage(AddMessageRequest addMessageRequest) {
        MessageLogDto result = messageService.addMessage(new MessageLogDto(addMessageRequest.getMessage().getMessageContent(), Instant.now(), addMessageRequest.getMessage().getUserAuthor() == null ? "anonymous" : addMessageRequest.getMessage().getUserAuthor()));
        AddMessageResponse response = new AddMessageResponse();
        OffsetDateTime offsetDateTime = result.getCreatedTime().atOffset(ZoneOffset.UTC);
        response.setMessage(new Message().messageContent(result.getMessageContent()).userAuthor(result.getUserAuthor()).createdTime(offsetDateTime));
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<LogMessageResponse> getMessages() {
        LogMessageResponse response = new LogMessageResponse();
        response.setMessages(
                messageService.getMessages().stream()
                        .map(messageLogDto ->
                                new Message()
                                        .messageContent(messageLogDto.getMessageContent())
                                        .userAuthor(messageLogDto.getUserAuthor())
                                        .createdTime(messageLogDto.getCreatedTime().atOffset(ZoneOffset.UTC))
                        )
                        .toList()
        );
        return ResponseEntity.ok(response);

    }
}
