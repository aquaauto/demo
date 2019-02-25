package com.coffeeshop.preferences;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preferences")
public class PreferencesController {

    @GetMapping("")
    public String getPrefernces(){
        return " Test Preference response.";
    }
}
