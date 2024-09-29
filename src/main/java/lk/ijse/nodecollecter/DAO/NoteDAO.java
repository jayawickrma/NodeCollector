package lk.ijse.nodecollecter.DAO;

import lk.ijse.nodecollecter.Entity.EntityIMPL.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDAO extends JpaRepository<NoteEntity,String> {
}
