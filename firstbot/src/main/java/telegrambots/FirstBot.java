package telegrambots;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class FirstBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String msgText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            SendMessage msg = new SendMessage().setChatId(chatId).setText(msgText); // Create a message object
            try {
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "exampleofsomebot";
    }

    @Override
    public String getBotToken() {
        return "1165804889:AAHsv8AXEoTn0wISRpyIA2V5rA_T9JRwDK4";
    }
}
