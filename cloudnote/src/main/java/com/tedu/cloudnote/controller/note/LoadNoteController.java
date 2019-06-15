package com.tedu.cloudnote.controller.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.cloudnote.service.NoteService;
import com.tedu.cloudnote.util.NoteResult;

@Controller
public class LoadNoteController {
	@Autowired
	private NoteService noteService;
	@RequestMapping("/note/load.do")
	@ResponseBody
	public NoteResult execute(String noteId){
		return noteService.loadNote(noteId);
		
	}

}
