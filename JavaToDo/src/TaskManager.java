import java.util.ArrayList;



public class TaskManager {
	private ArrayList<Task> tasks;

	public ArrayList<Task> getTasks() {
		return tasks;
	}
		
	public TaskManager() {
		tasks = new ArrayList<Task>();	
	}
	
	public void refreshId() {
		for(Task task :tasks) {
			task.setId(tasks.indexOf(task));
		}
	}
	public void addTask(Task task) {
	
		tasks.add(task);
		task.setId(tasks.indexOf(task));
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
			if(id == tasks.indexOf(task)) {
				tasks.remove(task);
				System.out.println("Task deleted.");
			}
		}		
	}
	
	public void  completeTask(int id) {
		for(Task task : tasks) {
			if(id == tasks.indexOf(task)) {
				task.setCompleted(true);
				System.out.println("Task completed.");
			}
		}
	}
	

}
