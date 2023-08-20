package com.gila.notification;

import com.gila.notification.common.dto.MessageLogDto;
import com.gila.notification.persistence.entities.MessageLog;
import com.gila.notification.persistence.repositories.MessageLogRepository;
import com.gila.notification.service.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest {

    @Mock
    private ModelMapper modelMapper;
    @Mock
    private MessageLogRepository messageLogRepository;
    @InjectMocks
    private MessageService messageService;



    @Test
    void testAddMessage() {
        MessageLogDto inputDto = new MessageLogDto("messageContent", Instant.now(), "userAuthor");
        MessageLog mappedMessageLog = new MessageLog();
        MessageLog savedMessageLog = new MessageLog();
        MessageLogDto resultDto = new MessageLogDto("messageContent", Instant.now(), "userAuthor");

        when(modelMapper.map(inputDto, MessageLog.class)).thenReturn(mappedMessageLog);
        when(messageLogRepository.save(mappedMessageLog)).thenReturn(savedMessageLog);
        when(modelMapper.map(savedMessageLog, MessageLogDto.class)).thenReturn(resultDto);

        MessageLogDto response = messageService.addMessage(inputDto);

        assertEquals(resultDto, response);
    }

    @Test
    void testGetMessages() {
        List<MessageLog> messageLogs = Collections.singletonList(new MessageLog());
        MessageLogDto resultDto = new MessageLogDto("messageContent", Instant.now(), "userAuthor");

        when(messageLogRepository.findAllOrderByCreatedTimeDesc()).thenReturn(messageLogs);
        when(modelMapper.map(messageLogs.get(0), MessageLogDto.class)).thenReturn(resultDto);

        List<MessageLogDto> response = messageService.getMessages();

        assertEquals(1, response.size());
        assertEquals(resultDto, response.get(0));
    }
}
