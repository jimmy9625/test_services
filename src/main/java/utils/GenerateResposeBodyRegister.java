package utils;

import models.responses.ResponseRegistry;
import org.json.JSONObject;

public class GenerateResposeBodyRegister {

    public static String body(ResponseRegistry info) {
        JSONObject body = new JSONObject();

        body.put("token", info.getToken());
        body.put("id", info.getId());

        return body.toString();

    }
}
