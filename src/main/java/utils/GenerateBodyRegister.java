package utils;


import org.json.JSONObject;

public class GenerateBodyRegister {


    public static String whitData(String password, String email) {
        JSONObject body = new JSONObject();

        body.put("password", password);
        body.put("email", email);

        return body.toString();


    }


}
