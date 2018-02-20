package br.edu.maxk.ceepws.service

import br.edu.maxk.ceepws.model.Note
import br.edu.maxk.ceepws.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteServiceimpl : NoteService {

    @Autowired
    lateinit var noteRepository: NoteRepository

    override fun list(): List<Note> {
        return noteRepository.findAll().toList()
    }

    override fun add(note: Note): Note {
        return noteRepository.save(note)
    }

    override fun alter(id: Long, note: Note): Note {
        if (noteRepository.exists(id)) {
            val safeNote = note.copy(id = id)
            return noteRepository.save(note)
        }
        return Note()
    }

    override fun delete(id: Long) {
        if(noteRepository.exists(id)) {
            noteRepository.delete(id)
        }
    }
}
