package kh.com.laytong.demo.Register;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class RegisterService {
    private final Map<Long, Register> registers = new ConcurrentHashMap<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public Register registerUser (@RequestParam CreateRegisterRequest request){

        Register register = new Register();
        register.setAge(request.getAge());
        register.setUserName(request.getUserName());
        register.setEmail(request.getEmail());
        register.setPassword(request.getPassword());
        register.setId(nextId.getAndIncrement());

        registers.put(register.getId(), register);

        return register;
    }
}
