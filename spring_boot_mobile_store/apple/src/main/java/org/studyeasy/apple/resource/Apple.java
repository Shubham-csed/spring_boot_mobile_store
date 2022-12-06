package org.studyeasy.apple.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.apple.model.Device;
import org.studyeasy.apple.model.Devices;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {
    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Apple iPhone 13 Mini (256GB) - (Product) RED","Smartphone","img\\Apple iPhone 13 Mini.jpg","$1000","5.4-inch (13.7 cm diagonal) Super Retina XDR display with True Tone","64GB, 256GB, 512GB","iPhone with iOS 15, USB-C to Lightning Cable, Documentation","4.97 ounces (141 grams)"));
        devices.add(new Device("Apple iPhone 14 Plus 128GB Midnight","Smartphone","img\\Apple iPhone 14 Plus 128GB Midnight.jpg","$1100","6.7-inch Super Retina XDR display","128GB, 256GB, 512GB, 1TB","iPhone with iOS 16, USB-C to Lightning Cable, Documentation","7.16 ounces (203 grams)"));
        devices.add(new Device("Apple iPhone 14 Plus 256GB Starlight","Smartphone","img\\Apple iPhone 14 Plus 256GB Starlight.jpg","$1200","6.7-inch Super Retina XDR display","128GB, 256GB, 512GB, 1TB","iPhone with iOS 16, USB-C to Lightning Cable, Documentation","7.16 ounces (203 grams)"));
        

        Devices devicesList = new Devices(devices);
        return  devicesList;
    }
}
