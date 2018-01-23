package br.edu.maxk.ceepws.repository

import br.edu.maxk.ceepws.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long> {
}