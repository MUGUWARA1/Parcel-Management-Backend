package com.example.facteur.Controller;

import com.example.facteur.Entity.CentrePostal;
import com.example.facteur.Entity.Colis;
import com.example.facteur.Repo.CentrePostalRepo;
import com.example.facteur.Repo.ColisRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Postal")
public class CentrePostalController {
    private CentrePostalRepo centrePostalRepo;
    private ColisRepo colisRepo;


    @GetMapping("/All")
    public List<CentrePostal> getAll(){
        return this.centrePostalRepo.findAll();
    }

    @GetMapping("/{id}")
    public CentrePostal getByID(@PathVariable Long id){
        return this.centrePostalRepo.findById(id).orElseThrow(()->new RuntimeException("NOt Founded"));
    }

    @PostMapping("/add")
    public CentrePostal add(@RequestBody CentrePostal c){
        return this.centrePostalRepo.save(c);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        this.centrePostalRepo.deleteById(id);

    }
    @PutMapping("/update")
    public CentrePostal update(@RequestBody CentrePostal c)
    {
        if(this.centrePostalRepo.findById(c.getId())!=null){
            return this.centrePostalRepo.save(c);
        }
        return null;
    }

    public CentrePostalController(CentrePostalRepo centrePostalRepo, ColisRepo colisRepo) {
        this.centrePostalRepo = centrePostalRepo;
        this.colisRepo = colisRepo;
    }

    @PostMapping("/deposer/{CentrePostalId}")
    public Colis deposerColis(@RequestBody Colis c,@PathVariable Long CentrePostalId){
        CentrePostal cp=this.getByID(CentrePostalId);
        cp.getColisList().add(c);
        c.getPostalList().add(cp);
        centrePostalRepo.save(cp);
        colisRepo.save(c);

        return c;


    }
}
