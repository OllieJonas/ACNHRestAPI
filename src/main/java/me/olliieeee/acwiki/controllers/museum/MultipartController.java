package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.services.museum.impl.MultipartServiceImpl;
import me.olliieeee.acwiki.types.museum.Multipart;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/art/multipart")
public class MultipartController extends Controller<Service<Multipart>> {

    public MultipartController() {
        super(new MultipartServiceImpl());
    }

}
