package com.estags.estagsdiaries.controller;

import com.estags.estagsdiaries.data.Diary;
import com.estags.estagsdiaries.data.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/my-diary")
public class DiaryController {

    @Autowired  //indico ao Spring para injetar uma instacia desse repositorio e cuidar de suas dependências
    DiaryRepository repository;

    @PostMapping  //já está implícito que salvará uma nova entrada
    public String novaEntrada(@RequestParam String text, @RequestParam String sentiment) {
        Diary novaMemoria = Diary.builder()
                .text(text)
                .sentimento(sentiment).build();

        repository.save(novaMemoria);
        return "Nova memória registrada!";
    }

    @GetMapping
    public List<Diary> minhasMemorias() { return repository.findAll(); }

}
