package my.project.hotelmanagement.controller;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.entity.ServiceEntity;
import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.service.RoomService;
import my.project.hotelmanagement.service.TypeRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/type_room")
public class Setup_Type_Room_Controller {
    @Autowired
    TypeRoomService typeRoomServiceIF;
    @Autowired
    RoomService roomServiceIF;

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
            return "redirect:/admin/type_room/setup_type_room";
        }
        typeRoomServiceIF.saveTypeRoom(typeRoomEntity);
        return "redirect:/admin/type_room/setup_type_room";
    }
    public boolean checkTypeIDHasRooms(Integer typeID){
        List<RoomEntity> roomEntityList = roomServiceIF.getAllRoom();
        for (RoomEntity room: roomEntityList) {
            if(room.getTypeRoomEntity().getTypeRoomID()== typeID)
                return true;
        }
        return false;
    }
    @GetMapping("/delete_type_room")
    public String deleteService(@RequestParam(value = "typeRoomID") int typeRoomID, Model model){
        List<RoomEntity> roomEntityList = roomServiceIF.getAllRoom();
        if(checkTypeIDHasRooms(typeRoomID)){
            model.addAttribute("scriptError", "alert('Not remove')");
            return "redirect:/admin/type_room/setup_type_room";
        }
        model.addAttribute("scriptError", "");
        typeRoomServiceIF.deleteTypeRoom(typeRoomServiceIF.getTypeRoomByID(typeRoomID));
        return "redirect:/admin/type_room/setup_type_room";
    }
    @GetMapping("/edit_type_room")
    public String editService(@RequestParam("typeRoomID") int typeRoomID, Model model){
        TypeRoomEntity typeRoomEntity = typeRoomServiceIF.getTypeRoomByRoomID(typeRoomID);
        model.addAttribute("typeRoomEntity", typeRoomEntity);
        return "edit_type_room";
    }
    @PostMapping("/save_edit_type_room")
    public String saveEditService(@Valid TypeRoomEntity typeRoomEntity, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("typeRoomEntity",typeRoomEntity);
            return  "redirect:/admin/type_room/edit_type_room?typeRoomID=" + typeRoomEntity.getTypeRoomID() ;
        }
        typeRoomServiceIF.upadteTypeRoom(typeRoomEntity);
        return "redirect:/admin/type_room/edit_type_room?typeRoomID=" + typeRoomEntity.getTypeRoomID() ;
    }
}
