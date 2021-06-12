package my.project.hotelmanagement.controller;

import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.service.TypeRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/type_room")
public class Setup_Type_Room_Controller {
    @Autowired
    TypeRoomService typeRoomServiceIF;

    @GetMapping("/setup_type_room")
    public String showSetupTypeRoom(Model model){
        TypeRoomEntity typeRoomEntity = new TypeRoomEntity();
        model.addAttribute("typeRoomEntity", typeRoomEntity);
        List<TypeRoomEntity> listTypeRoomEntityList = typeRoomServiceIF.getAllTypeRoom();
        model.addAttribute("listTypeRoomEntityList", listTypeRoomEntityList);
        return "setup_type_room";
    }
    @PostMapping("/save_type_room")
    public String saveTypeRoom(@Validated TypeRoomEntity typeRoomEntity, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("typeRoomEntity", typeRoomEntity);
            return "redirect:/type_room/setup_type_room";
        }
        typeRoomServiceIF.saveTypeRoom(typeRoomEntity);
        return "redirect:/type_room/setup_type_room";
    }
}
