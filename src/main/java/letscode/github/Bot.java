package letscode.github;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;

public class Bot {
    TelegramBot bot = new TelegramBot(System.getenv("BOT_TOKEN"));

    public void sendMessage(String text) {

        bot.setUpdatesListener(updates -> {
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

        Long chatId = new Long(System.getenv("CHAT_ID"));
        SendResponse response = bot.execute(new SendMessage(chatId, text));
//        Update update = BotUtils.parseUpdate(text); // from String
//        Message message = update.message();
////        CallbackQuery callbackQuery = update.callbackQuery();
//
//
//        if (message != null) {
//            long chatId = update.message().chat().id();
//            SendMessage request = new SendMessage(chatId, update.toString())
//                    .parseMode(ParseMode.HTML)
//                    .disableWebPagePreview(true)
//                    .disableNotification(true)
//                    .replyToMessageId(1)
//                    .replyMarkup(new ForceReply());
//
//
//            SendResponse sendResponse = bot.execute(request);
//            boolean ok = sendResponse.isOk();
//            message = sendResponse.message();
//        }
//        if (request != null) {
//            bot.execute(request);
//        }


        //////////////////////
    }

//    private void sendAllMessages(String chatId, String text) {
//        SendMessage message = new SendMessage();
//        message.setText(text);
//        message.setChatId(chatId);
//        try {
//            execute(message);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }

//    private void process(Update update) {
//
//    }

//    public void sendEvent(String chatId, String text){
//        SendMessage message = new SendMessage();
//        message.setText(text);
//        message.setParseMode(ParseMode.MARKDOWN);
//        message.setChatId(Long.parseLong(chatId));
//        try {
//            //просто вызываем класс EventListner с методом execute
//            new EventListener().execute(message);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }

}
