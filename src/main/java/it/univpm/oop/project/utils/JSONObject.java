package it.univpm.oop.project.utils;

public class JSONObject {
	/** Effettua lo stream da URL del file JSON e ne salva il contenuto,
	 * riga per riga, in una stringa.
	 * @return Stringa che racchiude il contenuto del JSON streamato
	 * @throws IOException nel momento in cui si verifica un errore nella lettura del file 
	 */
	private String getJSONFromURL() {
			
		String line = "";
		String data = "";
			
		try { 
			URLConnection openConnection = 
					new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/"
						  + "friends/list.json?screen_name=efrontoni&count=100").openConnection();
			BufferedInputStream in =new BufferedInputStream(openConnection.getInputStream());
				
			try {
					
				InputStreamReader inR = new InputStreamReader(in);
				BufferedReader buf = new BufferedReader (inR);
					
				while ((line = buf.readLine() ) != null) {
					data += ( line ); 
				}
						
			} finally {
				in.close();
			}
				
		} catch (IOException e) {	
				throw new FetchException();
		}
		
		return data;
	}
	
	/** Chiama il metodo getJSONFromURL per ottenere la stringa 
	 * e ne effettua il parsing in JSONObject.
	 * @return JSONObject contenente tutti i friends dell'utente appena presi in INPUT
	 */
	public JSONObject parsing() {	
			
		JSONObject obj = null; 
		String data = getJSONFromURL();
		try {
			obj = (JSONObject)JSONValue.parseWithException(data);
		
		} catch (ParseException e) {
			throw new FetchException();
		}	
		
		return obj;
	}
}
