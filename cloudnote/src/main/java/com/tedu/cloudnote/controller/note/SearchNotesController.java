package com.tedu.cloudnote.controller.note;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.cloudnote.service.NoteService;
import com.tedu.cloudnote.util.NoteResult;

@Controller
public class SearchNotesController {
	@Autowired
	private NoteService noteService;
	@RequestMapping("/note/hight_search.do")
	@ResponseBody
	public NoteResult execute(String title,String status,String begin,String end){
		NoteResult result = noteService.searchNotes(title, status, begin, end);
		return result;
	}
	
}
