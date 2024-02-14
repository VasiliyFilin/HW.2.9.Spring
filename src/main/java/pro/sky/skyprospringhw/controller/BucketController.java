package pro.sky.skyprospringhw.controller;

import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringhw.model.Bucket;
import pro.sky.skyprospringhw.service.BucketService;

import java.util.Collection;

@RestController
@RequestMapping(path = "/order")
public class BucketController {
    private final BucketService service;

    public BucketController(BucketService service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public Collection<Bucket> addItem(@RequestParam("itemId") String... itemIds) throws BadRequestException {
        service.addItem(itemIds);
        return service.getAllItems();
    }

    @GetMapping(path = "/get")
    public Collection<Bucket> getAllItems() {
        return service.getAllItems();
    }
}
