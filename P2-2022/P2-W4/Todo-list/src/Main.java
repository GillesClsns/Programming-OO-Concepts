import be.gilles.TodoList;

import static be.gilles.sorting.SortingType.*;
import static be.gilles.sorting.SortingOrder.*;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList();

        todoList.addTodoItem("B", 35, "2015-01-12");
        todoList.addTodoItem("C", 102, "2015-01-01");
        todoList.addTodoItem("A", 1, "2015-01-18");

        todoList.sortBy(PRIORITY, DESC);
        todoList.toon();

    }
}
