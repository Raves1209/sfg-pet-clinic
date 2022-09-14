package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    private final VetService verService;

    public VetController(VetService verService) {
        this.verService = verService;
    }

    @RequestMapping({"/vets","vets/index", "vets/index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets", verService.findAll());
        return "vets/index";
    }
}
