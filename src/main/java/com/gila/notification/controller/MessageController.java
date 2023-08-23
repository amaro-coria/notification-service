package com.gila.notification.controller;

import com.gila.notification.api.MessageApi;
import com.gila.notification.api.model.AddMessageRequest;
import com.gila.notification.api.model.AddMessageResponse;
import com.gila.notification.api.model.LogMessageResponse;
import com.gila.notification.api.model.Message;
import com.gila.notification.common.dto.MessageLogDto;
import com.gila.notification.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.OffsetDateTime;

@RestController
public class MessageController implements MessageApi {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public ResponseEntity<AddMessageResponse> addMessage(AddMessageRequest addMessageRequest) {
        MessageLogDto result = messageService.addMessage(new MessageLogDto(addMessageRequest.getMessage().getMessageContent(), Instant.now(), addMessageRequest.getMessage().getUserAuthor()));
        AddMessageResponse response = new AddMessageResponse();
        response.setMessage(new Message().messageContent(result.messageContent()).userAuthor(result.userAuthor()).createdTime(OffsetDateTime.from(result.createdTime())));
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<LogMessageResponse> getMessages() {
        LogMessageResponse response = new LogMessageResponse();
        response.setMessages(messageService.getMessages().stream().map(messageLogDto -> new Message().messageContent(messageLogDto.messageContent()).userAuthor(messageLogDto.userAuthor()).createdTime(OffsetDateTime.from(messageLogDto.createdTime()))).toList());
        return ResponseEntity.ok(response);
    }
}
