package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.museum.MultipartService;
import me.olliieeee.acwiki.services.museum.impl.MultipartServiceImpl;
import me.olliieeee.acwiki.types.museum.Fish;
import me.olliieeee.acwiki.types.museum.Multipart;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/art/multipart")
public class MultipartController extends Controller<Multipart> {

    public MultipartController() {
        super(new MultipartServiceImpl());
    }

}
