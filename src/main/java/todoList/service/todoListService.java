package todoList.service;

import java.util.ArrayList;

import todoList.DTO.todoListDTO;

public interface todoListService {

	public ArrayList<todoListDTO> list();
	
	public void addList(String work);

	public void deleteList(int num);

}
