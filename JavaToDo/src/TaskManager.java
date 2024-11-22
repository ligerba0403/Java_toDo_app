import java.util.ArrayList;


public class TaskManager {
	private ArrayList<Task> tasks;
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	
	
	public TaskManager() {
		tasks = new ArrayList<Task>();
		size = 0;
		
	}
	
	public void addTask(Task task) {
		size++;
		tasks.add(task);
		System.out.println("New task added.");
	}
	
	
	public void listTasks() {
		if (tasks.isEmpty()){
			System.out.println("You do not have any task.");
		}
		else{
			for(Task task : tasks) {System.out.println(task.getId() + " : " + task.getTask());}
		}
	}
	
	public void deleteTask(int id) {
		for(Task task : tasks) {
			if(task.getId() == id) {
			tasks.remove(id);
			System.out.println("Task deleted.");
			}
		}
	}
	
	public void  completeTask(int id) {
		for(Task task : tasks) {
			if(task.getId() == id) {
			task.setCompleted(true);
			System.out.println("Task completed.");
			}
		}
	}
	

}
