package lk.ijse.nodecollecter.service;

import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServiceIMPL implements NoteServices{


    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteID(AppUtill.generateNoteID());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return null;
    }

    @Override
    public NoteDTO getNote(String noteID) {
        return null;
    }

    @Override
    public void deleteNote(String noteID) {

    }

    @Override
    public void updateNote(String noteId, NoteDTO noteDTO) {

    }
}
