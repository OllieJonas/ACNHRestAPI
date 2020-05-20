package me.olliieeee.acwiki.controllers.museum;

import me.olliieeee.acwiki.controllers.Controller;
import me.olliieeee.acwiki.services.Service;
import me.olliieeee.acwiki.types.museum.Creature;

public abstract class CreatureController<T extends Service<? extends Creature>> extends Controller<T> {

    public CreatureController(T service) {
        super(service);
    }
}
