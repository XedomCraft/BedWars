package org.screamingsandals.bedwars.api.events;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.BedwarsAPI;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;
import org.screamingsandals.lib.utils.Wrapper;

import java.util.function.Consumer;

@ApiStatus.NonExtendable
public interface ApplyPropertyToBoughtItemEvent<G extends Game, P extends BWPlayer, I extends Wrapper> extends ApplyPropertyToItemEvent<G, P, I> {

    @SuppressWarnings("unchecked")
    static void handle(Object plugin, Consumer<ApplyPropertyToBoughtItemEvent<Game, BWPlayer, Wrapper>> consumer) {
        BedwarsAPI.getInstance().getEventUtils().handle(plugin, ApplyPropertyToBoughtItemEvent.class, (Consumer) consumer);
    }
}
