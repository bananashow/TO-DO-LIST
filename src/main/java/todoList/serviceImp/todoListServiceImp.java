package todoList.serviceImp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todoList.DTO.todoListDTO;
import todoList.mapper.todoListMapper;
import todoList.service.todoListService;

@Service
public class todoListServiceImp implements todoListService {
	
	@Autowired
	todoListMapper mapper;

	@Override
	public ArrayList<todoListDTO> list() {
		return mapper.list();
	}

	@Override
	public void addList(String work) {
		mapper.addList(work);
	}

	@Override
	public void deleteList(int num) {
		mapper.deleteList(num);
	}
	
	
	
	

}
