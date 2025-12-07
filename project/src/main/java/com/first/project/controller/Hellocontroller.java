package com.first.project.controller;

import com.first.project.object.Hors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HorsController {

    @GetMapping("/api/hors")
    public ResponseEntity<String> getHorsName() {
        Hors h = new Hors();
        return ResponseEntity.ok(h.getName());
    }
}

