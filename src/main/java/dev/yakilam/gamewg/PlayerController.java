package dev.yakilam.gamewg;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {

    @GetMapping
    public ResponseEntity<String> allPlayers(){
        return new ResponseEntity<String>("Alle Spieler!", HttpStatus.OK);
    }
}
