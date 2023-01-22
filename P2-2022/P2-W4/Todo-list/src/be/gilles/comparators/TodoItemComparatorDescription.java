package be.gilles.comparators;

import be.gilles.TodoItem;

import java.util.Comparator;

public class TodoItemComparatorDescription implements Comparator<TodoItem> {

    @Override
    public int compare(TodoItem o1, TodoItem o2) {
        return o1.getDescription().compareToIgnoreCase(o2.getDescription());
    }
}
