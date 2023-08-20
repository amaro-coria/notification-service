package com.gila.notification.service;

import com.gila.notification.common.dto.MessageLogDto;
import com.gila.notification.persistence.entities.MessageLog;
import com.gila.notification.persistence.repositories.MessageLogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private MessageLogRepository messageLogRepository;
    private ModelMapper modelMapper;

    public MessageService(MessageLogRepository messageLogRepository, ModelMapper modelMapper) {
        this.messageLogRepository = messageLogRepository;
        this.modelMapper = modelMapper;
    }
    public MessageLogDto addMessage(MessageLogDto messageLogDto) {
        MessageLog messageLog = modelMapper.map(messageLogDto, MessageLog.class);
        messageLog = messageLogRepository.save(messageLog);
        messageLogDto = modelMapper.map(messageLog, MessageLogDto.class);
        return messageLogDto;
    }

    public List<MessageLogDto> getMessages() {
        List<MessageLog> messageLogs = messageLogRepository.findAllOrderByCreatedTimeDesc();
        return messageLogs.stream()
                .map(messageLog -> modelMapper.map(messageLog, MessageLogDto.class))
                .toList();
    }

}
