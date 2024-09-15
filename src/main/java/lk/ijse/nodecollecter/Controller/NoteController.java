package lk.ijse.nodecollecter.Controller;

import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import lk.ijse.nodecollecter.service.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @Autowired
    private NoteServices noteServices;
    //consumes -frontend eken database ekt yawana data
    //produces -database eken frontend ekata yawana data
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO){
        noteDTO.setNoteID(AppUtill.generateNoteID());
        return noteServices.saveNote(noteDTO);
    }
    @GetMapping("he")
    public String getSelectedNote(){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO>  getAllNotes(){
        return noteServices.getAllNotes();
    }
    @DeleteMapping
    public void deleteNote(String noteID){

    }
    @PutMapping
    public void updateNote(String noteID,NoteDTO noteDTO){

    }
}
