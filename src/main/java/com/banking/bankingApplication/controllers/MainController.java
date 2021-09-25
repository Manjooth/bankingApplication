/* (C)2021 */
package com.banking.bankingApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestMapping(path = "/")
public class MainController {

    @GetMapping(path = "/home")
    public String getIndex() {
        return "home";
    }
}
