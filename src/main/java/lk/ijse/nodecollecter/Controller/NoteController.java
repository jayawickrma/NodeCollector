package lk.ijse.nodecollecter.Controller;

import lk.ijse.nodecollecter.DTO.IMPL.NoteDTO;
import lk.ijse.nodecollecter.Utill.AppUtill;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveNote(@RequestBody NoteDTO noteDTO){
        noteDTO.setNoteID(AppUtill.generateNoteID());
        return "Note Saved Successfully";
    }
    @GetMapping("he")
    public String getSelectedNote(){
        return null;
    }
    @GetMapping
    public List<NoteDTO>  getAllNotes(){
        return null;
    }
    @DeleteMapping
    public void deleteNote(String noteID){

    }
    @PutMapping
    public void updateNote(String noteID,NoteDTO noteDTO){

    }
}
