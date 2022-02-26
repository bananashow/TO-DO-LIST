package todoList.DTO;

public class todoListDTO {
	private int num;
	private String work;

	public todoListDTO() {
		super();
	}

	public todoListDTO(int num, String work) {
		super();
		this.num = num;
		this.work = work;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}
