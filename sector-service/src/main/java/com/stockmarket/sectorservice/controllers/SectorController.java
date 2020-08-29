package com.stockmarket.sectorservice.controllers;

import com.stockmarket.sectorservice.entities.Sector;
import com.stockmarket.sectorservice.services.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sectors")
public class SectorController {

    @Autowired
    private SectorService sectorService;

    @GetMapping("")
    public List<Sector> getAllSectors(){
        return sectorService.getAllSectors();
    }
    @GetMapping("{id}")
    public Optional<Sector> getSectorById(@PathVariable Integer id){
        return sectorService.getSector(id);
    }

    @PostMapping("")
    public void AddSector(@RequestBody Sector sector){
        sectorService.addSector(sector);
    }
    @PutMapping("{id}")
    public void UpdateSector(@PathVariable Integer id, Sector sector){
        sectorService.updateSector(id, sector);
    }
    @DeleteMapping("{id}")
    public void DeleteSector(@PathVariable Integer id){
        sectorService.deleteSector(id);
    }
}
