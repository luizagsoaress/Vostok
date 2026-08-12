package source;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class Api {

        JSONObject apod () throws Exception {
            URL url = new URL("https://nasa-server-p83d.onrender.com/apod");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            StringBuilder res;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                res = new StringBuilder();
                while((inputLine = in.readLine()) != null) {
                    res.append(inputLine);
                }
            }

            String json = res.toString();
            JSONObject obj = new JSONObject(json);

            return obj;
        }

        JSONObject neo () throws Exception {
            URL url = new URL("https://nasa-server-p83d.onrender.com/neo");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            StringBuilder res;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                res = new StringBuilder();
                while((inputLine = in.readLine()) != null) {
                    res.append(inputLine);
                }
            }

            String json = res.toString();
            JSONObject obj = new JSONObject(json);

            return obj;
        }

        JSONObject solarFlare () throws Exception {
            URL url = new URL("https://nasa-server-p83d.onrender.com/solar_flare");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            StringBuilder res;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                res = new StringBuilder();
                while((inputLine = in.readLine()) != null) {
                    res.append(inputLine);
                }
            }

            String json = res.toString();
            JSONObject obj = new JSONObject(json);

            return obj;
        }

        JSONObject notification () throws Exception {
            URL url = new URL("https://nasa-server-p83d.onrender.com/notification");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            StringBuilder res;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                res = new StringBuilder();
                while((inputLine = in.readLine()) != null) {
                    res.append(inputLine);
                }
            }

            String json = res.toString();
            JSONObject obj = new JSONObject(json);

            return obj;
        }

}