package com.example.easynotes;

import com.example.easynotes.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// this class will enable cruds operation for the notes instances
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
