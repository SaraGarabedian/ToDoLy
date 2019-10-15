import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAndQuit {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Apples", "2019-10-24", "Shopping"));
        tasks.add(new Task(2, "Bacon", "2020-10-24", "Shopping"));

        try {
            //saveTask(tasks, "TaskFile1.txt");
            loadTasks();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void saveTask(List<Task> taskList, String fileName) throws IOException {
        FileWriter write = new FileWriter(new File(fileName), false);
        PrintWriter print_line = new PrintWriter(write);
        for (Task task: taskList){
            print_line.println(task.toString());
        }
        print_line.close();
        write.close();
    }

    public static void loadTasks() throws FileNotFoundException {
        File file = new File("TaskFile.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String currentTaskString = sc.nextLine();
            System.out.println(currentTaskString);
        }
    }
}
