package kh.com.laytong.demo.Todo;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add-todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo (@RequestBody CreateTodoRequest request){
        Todo todo = todoService.createTodo(request);
        return new ResponseEntity<Todo>(todo, HttpStatus.CREATED);

    }
}
