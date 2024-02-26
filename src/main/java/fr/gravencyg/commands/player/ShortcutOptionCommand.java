package fr.gravencyg.commands.player;

import fr.gravencyg.CYG;
import fr.gravencyg.commands.TCommand;
import fr.gravencyg.menus.options.OptionMenu;
import fr.gravencyg.utils.CLevel;
import org.bukkit.entity.Player;

public class ShortcutOptionCommand extends TCommand {

    public ShortcutOptionCommand(CYG main) {
        super(main, CLevel.LEVEL1, false, false, true, false);
    }

    @Override
    public void onExecute(Player player, String[] args) {
        if(!player.getWorld().getName().contains(player.getUniqueId().toString()))
        {
            player.sendMessage("§cCommande à faire sur votre parcelle uniquement");
            return;
        }

        if(gameManager().isPlayerInGame(player).size() != 0)
        {
            player.sendMessage("§cCommande impossible durant une partie");
            return;
        }

        main.getMenuManager().open(player, OptionMenu.class);
    }
}
