package br.edu.maxk.ceepws.service

import br.edu.maxk.ceepws.model.Note

interface NoteService {

    fun list() : List<Note>

}