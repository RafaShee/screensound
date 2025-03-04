package br.com.rafashe.screesound.service;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGemini {
    public static String obterInformacao(String texto) {

        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("GEMINI_APIKEY"))
                .modelName("gemini-1.5-flash")
                .build();

        String response = gemini.generate("Me fale sobre o artista " + texto);
        return response;
    }
}
