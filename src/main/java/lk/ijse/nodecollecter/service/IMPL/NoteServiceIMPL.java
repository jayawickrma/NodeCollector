package lk.ijse.nodecollecter.service.IMPL;

import lk.ijse.nodecollecter.DAO.NoteDAO;
import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;
import lk.ijse.nodecollecter.Entity.EntityIMPL.NoteEntity;
import lk.ijse.nodecollecter.Utill.AppUtill;
import lk.ijse.nodecollecter.Utill.Mapping;
import lk.ijse.nodecollecter.service.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteServiceIMPL implements NoteServices {
    @Autowired
    private NoteDAO noteDAO;
    @Autowired
    private Mapping mapping;

    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        NoteEntity saveNote =noteDAO.save(mapping.toNoteEntity(noteDTO));
       return mapping.toNoteDto(saveNote);
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        List<NoteEntity> allNotes =noteDAO.findAll();
        return mapping.allNotes(allNotes);
    }

    @Override
    public NoteDTO getNote(String noteID)    {
      NoteEntity selectedNote=  noteDAO.getReferenceById(noteID);
      return mapping.toNoteDto(selectedNote);
    }

    @Override
    public void deleteNote(String noteID) {
            noteDAO.deleteById(noteID);
    }

    @Override
    public void updateNote(String noteId, NoteDTO noteDTO) {

    }
}
