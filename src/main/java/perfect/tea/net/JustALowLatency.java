package net.perfect.tea.justalowlatency

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import org.bukkit.plugin.java.JavaPlugin;

public class JustALowLatency {

    private static void simulateOperation(int millisseconds, int id) {
        try {
        System.out.println("--> Task " + id + " initializated.")
        Thread.sleep(millisseconds);
        System.out.println("<- Task " + id + " finished.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
        }
    }

    public static void main(String[] args) {
        
        final int NUM_TASKS = 10;
        final int SIMULATED_LATENCY_MS = 500;
    }

}

