package com.example.demo.controller;

import com.example.demo.model.Speaker;
import com.example.demo.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speakers")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    @PostMapping
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        return speakerService.createSpeaker(speaker);
    }

    @GetMapping
    public List<Speaker> getAllSpeakers() {
        return speakerService.getAllSpeakers();
    }

    @GetMapping("/{id}")
    public Speaker getSpeakerById(@PathVariable Long id) {
        return speakerService.getSpeakerById(id);
    }

    @PutMapping("/{id}")
    public Speaker updateSpeaker(@PathVariable Long id, @RequestBody Speaker speaker) {
        return speakerService.updateSpeaker(id, speaker);
    }

    @DeleteMapping("/{id}")
    public void deleteSpeaker(@PathVariable Long id) {
        speakerService.deleteSpeaker(id);
    }
}
