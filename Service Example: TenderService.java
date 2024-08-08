package com.tender.management.service;

import com.tender.management.model.Tender;
import com.tender.management.repository.TenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderService {
    
    @Autowired
    private TenderRepository tenderRepository;
    
    public List<Tender> getAllTenders() {
        return tenderRepository.findAll();
    }
    
    public Tender createTender(Tender tender) {
        return tenderRepository.save(tender);
    }
    
    // Other methods such as updating, deleting tenders can be added here
}
