package it.univpm.oop.project.repository;
/**
 * Qui salviamo i feed
 * @author Giuseppe
 *
 */

import java.io.ObjectOutputStream;
import it.univpm.oop.project.application.*;
import java.io.*;

public class Repository {

	public void storeFeed(){
	try{
	 	ObjectInputStream in= new ObjectInputStream(new BufferedInputStream( new FileInputStream("SERIALIZZA.dat")));
	 	for(Post data: feed) {int i=0;
	 		x = ProjectApplication.run.log.info(ProjectApplication.feed.getData().get(i).getId().toString());
	 		in.readObject(x);}
		in.close(); 
	} catch (ClassNotFoundException ex) {
		System.out.println("Manca l'oggetto");
		System.out.println(ex);
	} catch (IOException e) {
		System.out.println("Errore di I/O");
		System.out.println(e);}
	}


	
	JSONArray array = object.getJSONArray("data");// data Ã¨ l'array json restituito da postman
	
	for(int i=0; i<array.length(); i++) {
		JSONObject o = object.getJSONArray("data").getJSONObject(i); // prende l'elemento in posizione i dell'array data e lo mette in o
		ObjectMapper m = new ObjectMapper();
		Post p = m.readValue(o.toString(), Post.class);
		post.add(p);
	}
	return post;
}



    /**
     * Metodo che riceve un URL che si riferisce ad un JSON che viene scaricato ed inserito all'interno di un JSON object
     * @param url URL che identifica il JSON
     * @return Restituisce il JSON object
     * @throws IOException Errore che viene lanciato nel caso in cui ci siano problemi nell'Input/Output
     */
    public static JSONObject getJSONFromURL(String url) throws IOException {
        StringBuilder sb = new StringBuilder();
        int currentChar;
        try(InputStream is = new URL(url).openStream()) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((currentChar = br.read()) != -1){
                sb.append((char) currentChar);
            }
            JSONObject json = new JSONObject(sb.toString());
            return json;
        }
    

  