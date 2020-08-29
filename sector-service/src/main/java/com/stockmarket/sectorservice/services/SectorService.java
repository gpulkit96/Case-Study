package com.stockmarket.sectorservice.services;

import com.stockmarket.sectorservice.entities.Sector;
import com.stockmarket.sectorservice.repositories.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SectorService {

    @Autowired
    private SectorRepository sectorRepository;

    public List<Sector> getAllSectors() {
        List<Sector> sectors = new ArrayList<>();
        sectorRepository.findAll()
                .forEach(sectors::add);
        return sectors;
    }

    public Optional<Sector> getSector(Integer id) {
        return sectorRepository.findById(id);
    }
    public Sector addSector(Sector sector) {
        return sectorRepository.save(sector);
    }
    public Sector updateSector(Integer id, Sector sector) {
        return sectorRepository.save(sector);
    }
    public void deleteSector(Integer id) {
        sectorRepository.deleteById(id);
    }
}
