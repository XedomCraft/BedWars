package org.screamingsandals.bedwars.events;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.screamingsandals.bedwars.api.events.PlayerLeaveEvent;
import org.screamingsandals.bedwars.game.GameImpl;
import org.screamingsandals.bedwars.game.TeamImpl;
import org.screamingsandals.bedwars.player.BedWarsPlayer;
import org.screamingsandals.lib.event.AbstractEvent;

@EqualsAndHashCode(callSuper = true)
@Data
public class PlayerLeaveEventImpl extends AbstractEvent implements PlayerLeaveEvent<GameImpl, BedWarsPlayer, TeamImpl> {
    private final GameImpl game;
    private final BedWarsPlayer player;
    private final TeamImpl team;
}
