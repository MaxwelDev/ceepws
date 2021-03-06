package br.edu.maxk.ceepws.service

import br.edu.maxk.ceepws.model.Note

interface NoteService {

    fun list() : List<Note>

    fun add(note: Note) : Note

    fun alter(id: Long, note: Note) : Note

    fun delete(id: Long)
}