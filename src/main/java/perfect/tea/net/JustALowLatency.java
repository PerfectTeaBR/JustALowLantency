package net.perfect.tea.justalowlatency

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import org.bukkit.plugin.java.JavaPlugin;

public final class JustALowLatency extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("plugin ligado com sucesso!");
        Bukkit.getConsoleSender().sendMessage("Plugin  iniciado!");
        // Plugin startup logic

    }

    @Override
    public void onLoad() {
        getLogger().info("Carregando ...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Desativado com Sucesso!")
            Bukkit.getConsoleSender().sendMessage("O Plugin foi desativado!")
    }
}

public class SimulateLatency {
    latency = int(Bukkit)getPlayer().send("Sua latência é {latency}");

