package komurcuoglu.ikys_backend.api.controller;


import komurcuoglu.ikys_backend.business.abstracts.CityService;
import komurcuoglu.ikys_backend.core.utilities.results.DataResult;
import komurcuoglu.ikys_backend.core.utilities.results.Result;
import komurcuoglu.ikys_backend.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {

    private CityService cityService;

    @Autowired
    public CitiesController(CityService cityService){
        this.cityService = cityService;
    }
    @PostMapping("/add")
    public Result add(@RequestBody City city){
        return cityService.add(city);
    }

    @PutMapping("/update")
    public Result update(@RequestBody City city){
        return cityService.update(city);
    }

    @GetMapping("/getAll")
    public DataResult<List<City>> getAll(){
        return cityService.getAll();
    }
    @GetMapping("/getById")
    public DataResult<City> getById(@RequestParam int id){
        return cityService.getById(id);

    }


}
