
package com.example.returnsystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ReturnController {

    @PostMapping("/test")
    public String test() {
        return "API Working!";
    }
}
