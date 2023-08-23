package com.gila.notification;
import com.gila.notification.api.model.AddMessageRequest;
import com.gila.notification.api.model.Message;
import com.gila.notification.common.dto.MessageLogDto;
import com.gila.notification.controller.MessageController;
import com.gila.notification.service.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MessageControllerTest {

    @Mock
    private MessageService messageService;

    @InjectMocks
    private MessageController messageController;

    private final Instant now = Instant.now();

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddMessage() {
        AddMessageRequest request = new AddMessageRequest();
        Message inputMessage = new Message().messageContent("testContent").userAuthor("testAuthor");
        request.setMessage(inputMessage);

        MessageLogDto dto = new MessageLogDto(inputMessage.getMessageContent(), now, inputMessage.getUserAuthor());

        when(messageService.addMessage(any(MessageLogDto.class))).thenReturn(dto);

        var responseEntity = messageController.addMessage(request);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals("testContent", responseEntity.getBody().getMessage().getMessageContent());
        assertEquals("testAuthor", responseEntity.getBody().getMessage().getUserAuthor());
    }

    @Test
    void testGetMessages() {
        MessageLogDto dto = new MessageLogDto("testContent", now, "testAuthor");
        when(messageService.getMessages()).thenReturn(Collections.singletonList(dto));

        var responseEntity = messageController.getMessages();

        assertEquals(200, responseEntity.getStatusCodeValue());
        List<Message> messages = responseEntity.getBody().getMessages();
        assertEquals(1, messages.size());
        assertEquals("testContent", messages.get(0).getMessageContent());
        assertEquals("testAuthor", messages.get(0).getUserAuthor());
    }
}