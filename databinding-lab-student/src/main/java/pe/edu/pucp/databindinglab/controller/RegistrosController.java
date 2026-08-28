package pe.edu.pucp.databindinglab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;

@Controller
public class RegistrosController {

    @GetMapping("/registros")
    public String form() {
        return "registros";
    }

    @PostMapping("/registros/requestparam")
    public String requestParam(
            @RequestParam String nombre,
            @RequestParam String tipo,
            @RequestParam String codigo,
            @RequestParam LocalDate date,
            Model model) {

        model.addAttribute("modo", "@RequestParam");
        model.addAttribute("resultado",
                "nombre=" + nombre + ", tipo=" + tipo + ", codigo=" + codigo + ", fecha=" + fecha);
        return "result";
    }

    /*
    @PostMapping("/exercise1/binding")
    public String binding(Persona persona, Model model) {
        model.addAttribute("modo", "Data Binding");
        model.addAttribute("resultado", persona.toString());
        return "result";
    }
     */
}
