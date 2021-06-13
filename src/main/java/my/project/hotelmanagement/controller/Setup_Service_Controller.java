package my.project.hotelmanagement.controller;

import my.project.hotelmanagement.entity.ServiceEntity;
import my.project.hotelmanagement.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/service")
public class Setup_Service_Controller {
    @Autowired
    ServiceService serviceServiceIF;

    @GetMapping("/setup_service")
    public String showSetupService(Model model){
        ServiceEntity serviceEntity = new ServiceEntity();
        model.addAttribute("serviceEntity", serviceEntity);
        List<ServiceEntity> serviceEntityList = serviceServiceIF.getAllService();
        model.addAttribute("serviceEntityList",serviceEntityList);
        return "setup_service";
    }
    @PostMapping("/save_service")
    public String saveService(@Valid ServiceEntity serviceEntity, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("serviceEntity",serviceEntity);
            return "redirect:/admin/service/setup_service";
        }
        serviceServiceIF.saveService(serviceEntity);
        return "redirect:/admin/service/setup_service";
    }
    @GetMapping("/delete_service")
    public String deleteService(@RequestParam(value = "serviceID") int serviceID){
//        int id = Integer.parseInt(serviceID);
        serviceServiceIF.deleteService(serviceServiceIF.getServiceByID(serviceID));
        return "redirect:/admin/service/setup_service";
    }
    @GetMapping("/edit_service")
    public String editService(@RequestParam("serviceID") int serviceID, Model model){
        ServiceEntity serviceEntity = serviceServiceIF.getServiceByID(serviceID);
        model.addAttribute("serviceEntity", serviceEntity);
        return "edit_service";
    }
    @PostMapping("/save_edit_service")
    public String saveEditService(@Valid ServiceEntity serviceEntity, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("serviceEntity",serviceEntity);
            return  "redirect:/admin/service/edit_service?serviceID=" + serviceEntity.getServiceID() ;
        }
        serviceServiceIF.updateService(serviceEntity);
        return "redirect:/admin/service/edit_service?serviceID=" + serviceEntity.getServiceID() ;
    }
}
