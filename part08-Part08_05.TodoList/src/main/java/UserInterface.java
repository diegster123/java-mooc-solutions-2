
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            commandHandle(command);
        }
    }

    private void commandHandle(String command) {

        if (command.equals("add")) {
            add();
        }
        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    private void add() {
        System.out.println("To add: ");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }

    private void list() {
        this.todoList.print();
    }

    private void remove() {
        System.out.println("Which one is removed? ");
        int remove = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(remove);
    }

}
