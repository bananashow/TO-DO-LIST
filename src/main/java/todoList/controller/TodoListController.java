package todoList.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import todoList.DTO.todoListDTO;
import todoList.service.todoListService;

@Controller
public class TodoListController {
	
	@Autowired
	todoListService todoService;

	@RequestMapping("/main")
	public String mainGo(Model model) {
		ArrayList<todoListDTO> list = todoService.list();
		model.addAttribute("list", list);
		return "main";
	}

	@RequestMapping("/main_process")
	public String mainProcessGo(@RequestParam("work") String work) {
		todoService.addList(work);
		return "redirect:main";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("num") int num) {
		todoService.deleteList(num);
		System.out.println(num);
		return "redirect:main";
	}
	
	@RequestMapping("/checkBox_process")
	public String checkBox_process(@RequestParam("num") int num) {
		return "checkBox_process";
	}

}
