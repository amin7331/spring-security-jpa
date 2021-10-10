package amin7331.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getHomepage() {
        return "<h1>Welcome to homepage</h1>";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "<h1>Welcome to admin page</h1>";
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "<h1>Welcome to user page</h1>";
    }
}
