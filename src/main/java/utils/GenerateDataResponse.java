package utils;

import models.SingleUser;
import org.json.JSONObject;

public class GenerateDataResponse {

    public static String body(SingleUser info) {
        JSONObject body = new JSONObject();

        body.put("id", info.getFirst_name());
        body.put("email", info.getEmail());
        body.put("first_name", info.getFirst_name());
        body.put("first_name", info.getFirst_name());
        body.put("last_name", info.getLast_name());
        body.put("avatar", info.getAvatar());


        return body.toString();
    }
}
