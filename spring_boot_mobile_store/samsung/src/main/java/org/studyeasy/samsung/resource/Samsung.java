package org.studyeasy.samsung.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.samsung.model.Device;
import org.studyeasy.samsung.model.Devices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {
    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Samsung Galaxy M13 (Aqua Green, 4GB, 64GB Storage)","Smartphone","img\\Samsung Galaxy M13.jpg","$250","401 PPI with 16M Color","4GB","‎Handset,Sim Ejection Pin, User Guide,Adapter, Type A to C Cable","207 g"));
        devices.add(new Device("Samsung Galaxy M53 5G (Mystique Green, 8GB, 128GB Storage","Smartphone","img\\Samsung Galaxy M53 5G.png","$500","AMOLED","8GB","Handset, Ejection Pin,Data Cable,Quick Start Guide","176 g"));
        devices.add(new Device("Samsung Galaxy S22 5G","Smartphone","img\\Samsung Galaxy S22 5G.png","$500","AMOLED","8GB","‎Handset, Ejection Pin,Data Cable,Quick Start Guide","167 g"));
               
        Devices devicesList = new Devices(devices);
        return  devicesList;
    }
}
