package com.example.praca_domowa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeWorkController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok("Wywołano endpoint z PathVariable: " + id);
    }

    @GetMapping()
    public ResponseEntity<String> search(@RequestParam("param") String param) {
        return ResponseEntity.ok("Wywołano endpoint z RequestParam: " + param);
    }
}