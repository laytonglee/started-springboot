package kh.com.laytong.demo.Register;

import kh.com.laytong.demo.Todo.CreateTodoRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public ResponseEntity<Register> registerUser (@RequestBody CreateRegisterRequest request){
        Register register = registerService.registerUser(request);
        return new ResponseEntity<>(register, HttpStatus.CREATED);
    }
}
