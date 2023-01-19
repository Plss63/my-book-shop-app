package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

  @GetMapping("/documents")
  public String getDocuments(){
    return "documents/index";
  }

  @GetMapping("/about")
  public String aboutCompany(){
    return "about";
  }

  @GetMapping("/faq")
  public String help(){
    return "faq";
  }

  @GetMapping("/contacts")
  public String getContacts(){
    return "contacts";
  }


}
