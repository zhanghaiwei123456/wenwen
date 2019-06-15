package com.tedu.cloudnote.dao;

import java.util.List;
import java.util.Map;

import com.tedu.cloudnote.entity.Note;
public interface NoteDao {
	public List<Map> findByBookId(String bookId);
	
	public Note findById(String noteId);
	
//	public int updateNote(Note note);
	
	public void save(Note note);
	
//	public int updateStatus(String noteId);
	
//	public int updateBookId(Note note);
	
//	public int updateTypeId(String noteId);
	
	public List<Note> findNotes(Map params);
	
	public int dynamicUpdate(Note note);
	
	public int batchDelete(String[] ids);


}
