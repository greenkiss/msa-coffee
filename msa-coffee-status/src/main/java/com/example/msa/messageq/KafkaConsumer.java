package com.example.msa.messageq;

import com.example.msa.repository.StatusRepository;
import com.example.msa.rest.dto.StatusRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KafkaConsumer {
    @Autowired
    private StatusRepository statusRepository;

    @KafkaListener(topics = "coffee-test", groupId = "coffee-status")
    public void processMessage(String Message){

        StatusRequestDto dto = new StatusRequestDto(Message);
        statusRepository.save(dto.toEntity());

    }
}
