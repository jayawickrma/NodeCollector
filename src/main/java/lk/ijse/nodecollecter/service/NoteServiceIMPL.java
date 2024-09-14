package lk.ijse.nodecollecter.service;

import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteServiceIMPL implements NoteServices{
    private static List<NoteDTO>noteDTOList =new ArrayList<>();
    NoteServiceIMPL(){
        noteDTOList.add(new NoteDTO("1","book","svdasfd","2020.2020.20","bdvsc","1"));
        noteDTOList.add(new NoteDTO("2","boooook","svdassdfvd","2020.2020.20","bdvsc","2"));
        noteDTOList.add(new NoteDTO("3","book","svdasfd","2020.2020.20","bdvsc","3"));
    }


    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteID(AppUtill.generateNoteID());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return noteDTOList;
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
