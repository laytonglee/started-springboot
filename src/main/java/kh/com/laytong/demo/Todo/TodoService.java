package kh.com.laytong.demo.Todo;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TodoService {
    private final Map<Long, Todo> Todos = new ConcurrentHashMap<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public Todo createTodo (CreateTodoRequest request){
        Todo todo = new Todo();
        todo.setTitle(request.getTitle());
        todo.setDescription(request.getDescription());
        todo.setCreatedAt(request.getCreatedAt());
        todo.setCompleted(request.isCompleted());
        todo.setId(nextId.getAndIncrement());
        Todos.put(todo.getId(), todo);

        return todo;
    }
}
