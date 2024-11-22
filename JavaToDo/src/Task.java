
public class Task {
	private int id;
	private String task;
	private boolean isCompleted;
	
	
	public Task(String task) {
		super();
		this.task = task;
		this.isCompleted = false;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
	

}
