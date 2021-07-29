package utils;

import models.UpdateUser;
import org.json.JSONObject;

public class GenerateBodyUpdate {
    public static String bodyRequest(UpdateUser user) {
        JSONObject body = new JSONObject();
        body.put("name", user.getName());
        body.put("job", user.getJob());
        return body.toString();
    }

    public static String bodyResponse(UpdateUser user) {
        JSONObject bodyResponse = new JSONObject();
        bodyResponse.put("name", user.getName());
        bodyResponse.put("job", user.getJob());
        return bodyResponse.toString();
    }

}
