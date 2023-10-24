package experiences.mock_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;

public class ApiRequestManager {
	
	final String url;
	
	public ApiRequestManager(final String url) {
			this.url = url;
	}
	
	private HttpURLConnection getHttpURLConnection(final String endPoint) {
		HttpURLConnection httpURLConnection = null;
		try {
			httpURLConnection = (HttpURLConnection) new URL(url + endPoint).openConnection();
			return httpURLConnection;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassCastException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(httpURLConnection != null) httpURLConnection.disconnect();
		}
	}
	
	public <T> T get(final String endPoint, Class<T> model) {
		HttpURLConnection connection = null;
		BufferedReader bufferedReader = null;
		T response = null;
		try {
			connection = getHttpURLConnection(endPoint);
			connection.setRequestMethod("GET");
			bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			response = new Gson().fromJson(bufferedReader, model);
			bufferedReader.close();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) connection.disconnect();
		}
		return response;
	}
	
	public <T> Integer post(final String endPoint, T model) {
		HttpURLConnection connection = null;
        OutputStream outputStream = null;
		int response = 0;
        try {
    		final String jsonInputString = new Gson().toJson(model);
    		connection = getHttpURLConnection(endPoint);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            outputStream = connection.getOutputStream();
            byte[] input = jsonInputString.getBytes("utf-8");
            outputStream.write(input, 0, input.length);
            int responseCode = connection.getResponseCode();
            response = responseCode;
			outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
			if(connection != null) connection.disconnect();
		}
        return response;
	}
	
	public <T> Integer put(final String endPoint, T model) {
		HttpURLConnection connection = null;
        OutputStream outputStream = null;
		int response = 0;
        try {
    		final String jsonInputString = new Gson().toJson(model);
    		connection = getHttpURLConnection(endPoint);
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            outputStream = connection.getOutputStream();
            byte[] input = jsonInputString.getBytes("utf-8");
            outputStream.write(input, 0, input.length);
            int responseCode = connection.getResponseCode();
            response = responseCode;
			outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
			if(connection != null) connection.disconnect();
		}
        return response;
	}
	
	public Integer delete(final String endPoint, final int id) {
		HttpURLConnection connection = null;
        OutputStream outputStream = null;
		int response = 0;
        try {
    		connection = getHttpURLConnection(endPoint + "/" + id);
            connection.setRequestMethod("DELETE");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            outputStream = connection.getOutputStream();
            byte[] input = String.format(("{\"id\": %d}"), id).getBytes("utf-8");
            outputStream.write(input, 0, input.length);
            int responseCode = connection.getResponseCode();
            response = responseCode;
			outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
			if(connection != null) connection.disconnect();
		}
        return response;
	}
}
