package be.gilles.comparators;

import be.gilles.TodoItem;

import java.util.Comparator;

public class TodoItemComparatorPriority implements Comparator<TodoItem> {

    @Override
    public int compare(TodoItem o1, TodoItem o2) {
        return o1.getPriority() - o2.getPriority();
    }
}
