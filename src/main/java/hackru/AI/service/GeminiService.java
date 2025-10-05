package hackru.AI.service;


import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeminiService {
    private final Client client;
    public String askGemini(String prompt) {

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Based on the following data, predict how" + prompt + "climate and emissions profile will look in 5 years. Provide a concise summary with projected CO2 trends, energy transition progress, and risk to Paris Agreement goals.",
                        null);

        return(response.text());
    }
}
