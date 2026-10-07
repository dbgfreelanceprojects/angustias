package es.dbgfreelance.angustias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InicioController {
 @GetMapping("/hola")
    public String hola() {
        return "Este sería un cambio desde el branch del sprint 1 para probar el merge con el branche de desa";
    }
}
