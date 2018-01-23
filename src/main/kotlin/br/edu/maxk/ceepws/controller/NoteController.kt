package br.edu.maxk.ceepws.controller

import br.edu.maxk.ceepws.model.Note
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @GetMapping
    fun list(): List<Note> {
        return listOf(Note("Leitura", "Livro de Spring Boot"),
                Note("pesquisa", "Ambiente com Docker"))
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return note;
    }

}