import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAndQuit {

    public static void saveTask(List<Task> taskList, String fileName) throws IOException {
        FileWriter write = new FileWriter(new File(fileName), false);
        PrintWriter print_line = new PrintWriter(write);
        for (Task task: taskList){
            print_line.println(task.toString());
        }
        print_line.close();
        write.close();
    }

    public static void loadTasks(List<Task> taskList, String fileName) throws FileNotFoundException, Exception {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String currentTaskString = sc.nextLine();
            //Split string into parts
            String[] splitList = currentTaskString.split("\\|");
            String idString = splitList[0].trim();
            //convert id to int
            int id = Integer.parseInt(idString);
            String title = splitList[1].trim();
            String dueDate = splitList[2].trim();
            String project = splitList[3].trim();
            String status = splitList[4].trim();
            //convert status to taskStatus
            TaskStatus taskStatus = TaskStatus.getValueFromString(status);
            //create new task
            Task task = new Task(id, title, dueDate,project, taskStatus);
            //add new task to task list
            taskList.add(task);
            System.out.println(task);
        }
        sc.close();
    }
}
