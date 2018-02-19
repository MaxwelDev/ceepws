package br.edu.maxk.ceepws.controller

import br.edu.maxk.ceepws.model.Note
import br.edu.maxk.ceepws.repository.NoteRepository
import br.edu.maxk.ceepws.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository: NoteRepository

    @Autowired
    lateinit var noteService: NoteService

    @GetMapping
    fun list(): List<Note> {
        return noteService.list()
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return noteService.add(note)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody note: Note): Note {
        return noteService.alter(id, note)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        if(noteRepository.exists(id)) {
            noteRepository.delete(id)
        }
    }
}