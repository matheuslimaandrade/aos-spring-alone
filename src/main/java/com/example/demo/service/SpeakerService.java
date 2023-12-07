package com.example.demo.service;

import com.example.demo.model.Speaker;
import com.example.demo.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {
    @Autowired
    private SpeakerRepository speakerRepository;

    public Speaker createSpeaker(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    public Speaker getSpeakerById(Long id) {
        return speakerRepository.findById(id).orElse(null);
    }

    public Speaker updateSpeaker(Long id, Speaker speaker) {
        speaker.setId(id);
        return speakerRepository.save(speaker);
    }

    public void deleteSpeaker(Long id) {
        speakerRepository.deleteById(id);
    }
}
