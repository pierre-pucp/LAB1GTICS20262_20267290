package pe.edu.pucp.databindinglab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;

@Controller
public class EquiposController {
    @GetMapping("/equipos")
    public String index() {
        return "equipos";
    }
}
