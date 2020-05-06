package souza.kelvin.projcomh2.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import souza.kelvin.projcomh2.model.SpriteEntity;
import souza.kelvin.projcomh2.repository.SpriteRepository;

import java.util.List;

@RestController
@RequestMapping("/sprite")
public class SpriteController { //CLASSE CONTROLADORA

    @Autowired
    private SpriteRepository spriteRepository;


    public ResponseEntity<List<SpriteEntity>> findAll() { //METODO GET
        return new ResponseEntity<List<SpriteEntity>>(
                (List<SpriteEntity>)this.spriteRepository.findAll(),
        new HttpHeaders(), HttpStatus.OK); //ERROR 404
    }

    //METODO GET
    @GetMapping(path = "/{id}")
    public ResponseEntity<SpriteEntity> findById(@PathVariable ("id") long id ) {
        if(this.spriteRepository.findById(id).isPresent()) {
            return new ResponseEntity<SpriteEntity>(
                    (SpriteEntity) this.spriteRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<SpriteEntity>(HttpStatus.NOT_FOUND);
    }

    //METODO POST
    @PostMapping
    public ResponseEntity<SpriteEntity> cadastrar (@RequestBody SpriteEntity spriteEntity) {
       return new ResponseEntity<SpriteEntity>(
               this.spriteRepository.save(spriteEntity),
               new HttpHeaders(), HttpStatus.CREATED);
    }

    //PUT
    @PutMapping(value = "/id")
    public ResponseEntity<SpriteEntity> atualizar (@PathVariable("id") long id,
                                                   @RequestBody SpriteEntity spriteEntity)throws Exception {
        if (id == 0 || this.spriteRepository.existsById(id)){
            throw new Exception("Código de produto não encontrado ou não existe...");

        }
        return new ResponseEntity<SpriteEntity>(
                this.spriteRepository.save(spriteEntity),
                new HttpHeaders(), HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<SpriteEntity> deletar (@PathVariable("id") long id) {
        this.spriteRepository.deleteById(id);
        return new ResponseEntity<SpriteEntity>(new HttpHeaders(), HttpStatus.OK);
    }


}
