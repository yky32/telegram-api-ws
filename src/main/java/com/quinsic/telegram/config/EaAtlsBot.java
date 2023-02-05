package com.quinsic.telegram.config;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

//Standard Spring component annotation
@Component
@Slf4j
public class EaAtlsBot extends TelegramLongPollingBot {

    @Value("${tg.bot.ea-atls.bot-username}")
    private String botUsername;
    @Value("${tg.bot.ea-atls.bot-token}")
    private String botToken;

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());

        SendMessage sendResponse = new SendMessage();
        sendResponse.setChatId(update.getMessage().getChatId().toString());
        sendResponse.setText("Haha Hello Dickson Wu.");
        execute(sendResponse);
    }

}
