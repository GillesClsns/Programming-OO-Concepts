package be.gilles;

import be.gilles.sorting.SortingOrder;
import be.gilles.sorting.SortingType;

import java.util.*;

public class TodoList {

    private final List<TodoItem> items;

    public TodoList() {
        this.items = new LinkedList<>();
    }

    public void addTodoItem(String description, int priority, String deadline) {
        items.add(new TodoItem(description, priority, deadline));

    }

    public void toon() {
        items.forEach(System.out::println);
    }

    public void sortBy(SortingType types, SortingOrder order) {
        if(order.equals(SortingOrder.DESC)) items.sort(types.getComparator().reversed());
        else items.sort(types.getComparator());
    }
}
