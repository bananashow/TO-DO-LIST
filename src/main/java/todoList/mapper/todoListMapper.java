package todoList.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import todoList.DTO.todoListDTO;

@Mapper
public interface todoListMapper {

	//to-do list 뿌리기
	@Select("SELECT * FROM list")
	public ArrayList<todoListDTO> list();
	
	//to-do list 추가
	@Insert("INSERT INTO list(work) VALUES(#{work})")
	public void addList(@Param("work") String work);
	
	//to-do list 삭제
	@Delete("DELETE FROM list WHERE num=#{num}")
	public void deleteList(@Param("num") int num);
}
