package br.com.denyssilva.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/user")
public class UserController {
    
    @PostMapping("/")
    public void create (@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }

}
