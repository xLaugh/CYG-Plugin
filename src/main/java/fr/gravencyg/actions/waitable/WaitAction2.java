package fr.gravencyg.actions.waitable;

import fr.gravencyg.CYG;
import fr.gravencyg.actions.Action;
import fr.gravencyg.model.ActionProcess;
import fr.gravencyg.utils.CLevel;
import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Random;

public class WaitAction2 extends Action {

    private Random random = new Random();

    public WaitAction2(CYG main) {
        super(main, CLevel.LEVEL4);
    }

    @Override
    public String title() {
        return ChatColor.BLUE + "Wait(10)";
    }

    @Override
    public String lore() {
        return ChatColor.GRAY + "Attendre 10s secondes";
    }

    @Override
    public void onExecute(Player player, Block block, ActionProcess actionProcess) { }


}
