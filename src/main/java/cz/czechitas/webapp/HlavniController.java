package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView zobrazIndex(VypoctyForm vysledkyZFormulare) {
        ModelAndView drzakNaDataAJmenoSablony = new ModelAndView("vysledky");
        drzakNaDataAJmenoSablony.addObject("celkovaSancePreziti", vysledkyZFormulare.celkovaSancePreziti());
        return drzakNaDataAJmenoSablony;
    }

}
