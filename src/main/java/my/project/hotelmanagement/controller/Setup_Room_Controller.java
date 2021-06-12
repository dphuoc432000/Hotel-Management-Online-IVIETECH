package my.project.hotelmanagement.controller;

import my.project.hotelmanagement.entity.RoomEntity;
import my.project.hotelmanagement.entity.RoomForm;
import my.project.hotelmanagement.entity.TypeRoomEntity;
import my.project.hotelmanagement.repository.RoomRepository;
import my.project.hotelmanagement.repository.TypeRoomRepository;
import my.project.hotelmanagement.service.RoomService;
import my.project.hotelmanagement.service.TypeRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/room")
public class Setup_Room_Controller {
    @Autowired
    RoomService romServiceIF;
    @Autowired
    TypeRoomService typeRoomServiceIF;
    @GetMapping("/setup_room")
    public String showSetupRoom(Model model){
        RoomEntity roomEntity = new RoomEntity();
        model.addAttribute("roomEntity", roomEntity);
        List<TypeRoomEntity> listTypeRoomEntityList = typeRoomServiceIF.getAllTypeRoom();
        model.addAttribute("listTypeRoomEntityList",listTypeRoomEntityList);
        List<RoomEntity> roomEntityList = romServiceIF.getAllRoom();
        model.addAttribute("roomEntityList", roomEntityList);
        return "setup_room";
    }
    @PostMapping("/save_room")
    public String saveRoom(@Valid RoomEntity roomEntity, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("roomEntity", roomEntity);
            return "redirect:/room/setup_room";
        }
        romServiceIF.saveRoom(roomEntity);
        return "redirect:/room/setup_room";
    }
}
