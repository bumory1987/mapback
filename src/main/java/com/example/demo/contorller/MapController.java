package com.example.demo.contorller;


import com.example.demo.dto.Marker;
import com.example.demo.dto.Receiver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {



    @GetMapping("/seedb")
    @ResponseBody
    List<Marker> getMarker(){
        List<Marker> markers = new ArrayList<>();
        markers.add(new Marker("A",37.542f,  126.98f));
        markers.add(new Marker("B",37.546f,  126.993f));
        markers.add(new Marker("C",37.531f,  126.988f));
        markers.add(new Marker("D",37.535f,  126.993f));

        return markers;
    }



    @GetMapping("/seeSec")
    @ResponseBody
    List<Marker> getMarkerTwo(){
        List<Marker> markers = new ArrayList<>();
        markers.add(new Marker("E",37.54f,  126.99f));
        markers.add(new Marker("F",37.542f,  126.991f));
        markers.add(new Marker("G",37.535f,  126.99f));
        markers.add(new Marker("H",37.535f,  126.992f));

        return markers;
    }



    @PostMapping("/user")
    @ResponseBody
    String getMarkerThree(@RequestBody Receiver receiver){
        System.out.println("receiver.getKeyval() = " + receiver.getKeyval());
        System.out.println("receiver.getKeyval() = " + receiver.getLocation());

        return "success";
    }

}
