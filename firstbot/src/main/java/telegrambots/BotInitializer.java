package telegrambots;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotInitializer {

    public static void main(String[] args) {
        // Initialize Api Context
        ApiContextInitializer.init();
        // Instatiate Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();
        // Register our bot
        try {
            botsApi.registerBot(new FirstBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
