package com.example.demo.service;

import com.example.demo.model.Conference;
import com.example.demo.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {
    @Autowired
    private ConferenceRepository conferenceRepository;

    public Conference createConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public List<Conference> getAllConferences() {
        return conferenceRepository.findAll();
    }

    public Conference getConferenceById(Long id) {
        return conferenceRepository.findById(id).orElse(null);
    }

    public Conference updateConference(Long id, Conference conference) {
        conference.setId(id);
        return conferenceRepository.save(conference);
    }

    public void deleteConference(Long id) {
        conferenceRepository.deleteById(id);
    }
}
