package my.project.hotelmanagement.controller;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.service.RoomService;
import my.project.hotelmanagement.service.TypeRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/room")
public class Setup_Room_Controller {
    @Autowired
    RoomService roomServiceIF;
    @Autowired
    TypeRoomService typeRoomServiceIF;
    @GetMapping("/setup_room")
    public String showSetupRoom(Model model){
        RoomEntity roomEntity = new RoomEntity();
        model.addAttribute("roomEntity", roomEntity);
        List<TypeRoomEntity> listTypeRoomEntityList = typeRoomServiceIF.getAllTypeRoom();
        model.addAttribute("listTypeRoomEntityList",listTypeRoomEntityList);
        List<RoomEntity> roomEntityList = roomServiceIF.getAllRoom();
        model.addAttribute("roomEntityList", roomEntityList);
        return "setup_room";
    }
    @PostMapping("/save_room")
    public String saveRoom(@Valid RoomEntity roomEntity, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("roomEntity", roomEntity);
            return "redirect:/admin/room/setup_room";
        }
        roomServiceIF.saveRoom(roomEntity);
        return "redirect:/admin/room/setup_room";
    }
    @GetMapping("/edit_room")
    public String showEditRoom(@RequestParam("roomID") int roomID, Model model){
        RoomEntity roomEntity = roomServiceIF.getRoomByID(roomID);
//        roomEntity.setTypeRoomEntity(typeRoomServiceIF.getTypeRoomByRoomID(roomID));
//        System.out.println(roomEntity.getTypeRoomEntity().getTypeRoomName());
        model.addAttribute("roomEntity",roomEntity);
        List<TypeRoomEntity> listTypeRoomEntityList = typeRoomServiceIF.getAllTypeRoom();
        model.addAttribute("listTypeRoomEntityList",listTypeRoomEntityList);
        return "edit_room";
    }
    @PostMapping("/save_edit_room")
    public String saveEditRoom(@Valid RoomEntity roomEntity, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("roomEntity", roomEntity);
            return "redirect:/admin/room/edit_room?roomID=" + roomEntity.getRoomID();
        }
        roomServiceIF.updateRoom(roomEntity);
        return "redirect:/admin/room/edit_room?roomID=" + roomEntity.getRoomID();
    }
    @GetMapping("/delete_room")
    public String deleteService(@RequestParam(value = "roomID") int roomID){
        roomServiceIF.deleteRoom(roomServiceIF.getRoomByID(roomID));
        return "redirect:/admin/room/setup_room";
    }
}
