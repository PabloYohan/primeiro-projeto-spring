package br.com.pabloyohan.primeiroprojetospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {
  
  @GetMapping("/primeiroMetodo")
  public String primeiroMetdodo() {
      return "Meu Primeiro Método ApiREST";
  }


}
