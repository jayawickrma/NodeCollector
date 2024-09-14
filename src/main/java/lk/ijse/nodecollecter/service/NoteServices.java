package lk.ijse.nodecollecter.service;

import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;

import java.util.List;

public interface NoteServices {
    String saveNote(NoteDTO noteDTO);
    List<NoteDTO> getAllNotes();
    NoteDTO getNote(String noteID);
    void deleteNote(String noteID);
    void updateNote(String noteId,NoteDTO noteDTO);
}
