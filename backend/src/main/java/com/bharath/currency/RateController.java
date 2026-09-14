package com.bharath.currency;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/rates") @CrossOrigin(origins="*") public class RateController{private final RateService service;public RateController(RateService s){service=s;}@GetMapping public RateService.Rates rates(@RequestParam(defaultValue="EUR")String base){return service.get(base.toUpperCase());}}
