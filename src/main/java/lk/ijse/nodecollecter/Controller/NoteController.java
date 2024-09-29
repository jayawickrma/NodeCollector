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
    public NoteDTO saveNote(
                            @RequestPart("noteTitle")String noteTitle,
                            @RequestPart("noteDesc")String noteDesc,
                            @RequestPart("date")String createDate,
                            @RequestPart("priorityLevel")String priorityLevel
                            ){
        String noteId=AppUtill.generateNoteID();
        NoteDTO noteDTO=new NoteDTO();
        noteDTO.setNoteID(noteId);
        noteDTO.setNoteTitle(noteTitle);
        noteDTO.setNoteDesc(noteDesc);
        noteDTO.setCreateDate(createDate);
        noteDTO.setPriorityLevel(priorityLevel);

        noteServices.saveNote(noteDTO);
        return noteDTO;

    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
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
