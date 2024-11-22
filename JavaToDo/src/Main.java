import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Java ToDo application");
		System.out.println("Created by aagaoglu.");
		System.out.println("-------------------------------------------------------------------------------------");
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
	
	while(true) {
		try {
			
			System.out.println("Please, make your Choose : ");
			System.out.println("to List Tasks : 1 ");
			System.out.println("to Add new Task : 2 ");
			System.out.println("to Deleted a Task : 3 ");
			System.out.println("to Complete a Task : 4 ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				taskManager.listTasks();
				break;
			}
			case 2:{
				System.out.println("Please Enter your task: ");
				scanner.nextLine(); // Boşta kalan satırı temizle
				String taskText = scanner.nextLine();
				Task newTask = new Task(taskManager.getSize(), taskText);
				taskManager.addTask(newTask);
				break;
			}
			case 3:{
				System.out.println("Select Task ID to Delete.");
				taskManager.listTasks();
				int deleteId = scanner.nextInt();
				taskManager.deleteTask(deleteId);
				break;
				
			}
			case 4:{
				System.out.println("Select Task ID to Complete.");
				taskManager.listTasks();
				int completedId = scanner.nextInt();
				taskManager.completeTask(completedId);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
			
		} catch (Exception e) {
			System.out.println("An unexpected error occurred");
		}
	}
	
	}

}
