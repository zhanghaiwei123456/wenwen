package com.tedu.cloudnote.controller.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.cloudnote.service.NoteService;
import com.tedu.cloudnote.util.NoteResult;
@Controller
public class LoadShareNoteController {
	@Autowired
	private NoteService noteService;
	@RequestMapping("/note/load_share")
	@ResponseBody
	public NoteResult execute(String shareId){
		return noteService.loadShareNote(shareId);
		
	}

}
