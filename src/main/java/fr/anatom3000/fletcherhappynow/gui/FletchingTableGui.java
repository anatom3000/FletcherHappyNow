package fr.anatom3000.fletcherhappynow.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WPlayerInvPanel;
import net.minecraft.entity.player.PlayerInventory;

public class FletchingTableGui extends LightweightGuiDescription {
    public FletchingTableGui(PlayerInventory inventory) {
        // GUI initialization
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(162, 160);
        // Widgets on the GUI
        WLabel fletchingTableLabel = new WLabel("Upgrade Arrow");
        root.add(fletchingTableLabel, 3, 1);
        WPlayerInvPanel inventoryWidget = new WPlayerInvPanel(inventory);
        root.add(inventoryWidget, 0, 4);
    }
}
