package com.galvanize.Kumquat_Republic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController

public class Controller {

    @Autowired
objectRepository objectRepository;


    @PostMapping("product/brand/{brand}")
    public ResponseEntity<ObjectFrame> byBrand (@PathVariable String brand ) {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.findByBrand(brand);
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }

    @PostMapping("product/brand/{color}")
    public ResponseEntity<ObjectFrame> byColor (@PathVariable String color ) {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.findByColor(color);
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }

    @PostMapping("product/brand/{price1}/{price2}")
    public ResponseEntity<ObjectFrame> byprice (@PathVariable Double price1,@PathVariable Double price2 ) {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.filterByPrice(price1,price2);
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }

    @PostMapping("product/brand/{brand}/{color}")
    public ResponseEntity<ObjectFrame> byfilter (@PathVariable String brand,@PathVariable String color ) {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.filter(brand,color);
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }

    @PostMapping("product/brand/ascprice")
    public ResponseEntity<ObjectFrame> Ascprice () {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.getbypriceasc();
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }

    @PostMapping("product/brand/descprice")
    public ResponseEntity<ObjectFrame> descprice () {

        ObjectFrame obj = new ObjectFrame();
        Optional<ObjectFrame> objectFrame= this.objectRepository.getbypricedesc();
        return new ResponseEntity<ObjectFrame>(objectFrame.get(),HttpStatus.OK);
    }
}
