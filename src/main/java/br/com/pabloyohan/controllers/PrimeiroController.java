package br.com.pabloyohan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {
  
  @GetMapping("/primeiroMetodo")
  public String primeiroMetdodo() {
      return "Meu Primeiro Método ApiREST";
  }

  @GetMapping("/primeiroMetodo/{id}")
  public String segundoMetodo(@PathVariable String id) {
      return "O parametro é " + id;
  }

  @GetMapping("/metodoQueryParams")
  public String metodoComQueryParam(@RequestParam String id) {
      return "O id do metodoComQueryParam é " + id;
  }

  @GetMapping("/metodoQueryParams2")
  public String metodoComQueryParam2(@RequestParam Map<String, String> allParams) {
      return "O id do metodoComQueryParam é " + allParams.entrySet();
  }
  
  


}
