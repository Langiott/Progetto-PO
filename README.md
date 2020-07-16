# Progetto Di Mauro Giuseppe & Langiotti Andrea  

![github-large](https://alumniunivpm.it/assets/img/logo/logo-UNIVPM.png)

Il progetto sfrutta le conoscenze della programmazione orientata ad oggetti per creare classi che ci permettono di gestire il data-set mediante un API REST-GET.
Per creare l'API rest è stato utilizzato Spring Boot un framework di Spring per la creazione di microservizi.
Tramite l'utilizzo del Rest Api (Get) ,con una repository, ci poniamo di ottenere dei post di Facebook dell' utente con lo scopo di analizzarli.Studiamo i post per:

-sapere se ci sono hastag nel post;

-sapere se ci sono emoticons;

-effettuare analisi statistiche sulla lunghezza dei testi.

Per la creazione del progetto abbiamo usato [Spring Initializr](https://start.spring.io/) che ci permette di scelgliere alcune specifiche di progetto, 
nel nostro caso abbiamo utilizzato:

* un progetto maven

* linguaggio di programmazione java 8

* versione Spring Boot 2.3.0

* packaging jar  

* e alcune dipendenze, che vengono elencare nel pom.xml


# Software utilizzati

[Eclipse](https://www.eclipse.org/downloads/packages/release/mars/r/eclipse-ide-java-ee-developers) - ambiente di sviluppo integrato.

[Spring Boot](https://spring.io/guides/gs/spring-boot/) - framework per sviluppo di applicazioni Java.

[Maven](https://maven.apache.org/) - strumento di gestione progetti.

[PostMan](https://www.postman.com/) - strumento per testare il service.

[GitHub](https://github.com/) - strumento per il deposito del progetto 

[GitHub Desktop](https://desktop.github.com/) - strumento per la scritture del Readme

[StarUml](http://staruml.io/)- strumento per la creazione di diagrammi 


# Diagrammi Casi d'Uso

![Diagrammi Casi d'Uso](https://user-images.githubusercontent.com/66262425/87712585-2d33ee80-c7a9-11ea-987a-eadee44d0cf0.JPG)


# Struttura 

![pacchetto](https://user-images.githubusercontent.com/66262425/87711513-a92d3700-c7a7-11ea-9d09-bbe78f6cf7c9.JPG)

# Eventuali Richieste

  TIPO  |  ROTTA     |  DESCRIZIONE  |
--------|------------|---------------|
GET     |/feed  |return all the feed|
GET     |/feed/comments|return all the comments|
GET     |/Stats      |return al the stats|



# UML 

- [Struttura package e classi](#struttura-package-e-classi)
- [Application](#application)
- [Controller](#controller)
- [Exception](#exception)
- [Model](#model)
- [Repository](#repository)
- [Service](#service)
- [Utils](#utils)
- [Tests](#tests)

>Le immagini sono state realizzate con StarUml e sono state modificate e salvate con modello jpeg 

---

### Struttura package e classi

![Struttura package e classi](https://user-images.githubusercontent.com/66262425/87711527-aaf6fa80-c7a7-11ea-98bb-b2b249437ce4.JPG)

### Application 

![Application](https://user-images.githubusercontent.com/66262425/87711507-a7637380-c7a7-11ea-922c-d84b1ccf6aa9.JPG)

Il modello Application mi gestisce le classi con un framework Spring Boot. 
Per la generazione dell’Access Token abbiamo visitato il sito https://developers.facebook.com effettuato l’accesso Facebook, creiamo un’app
definita da un nome e dall’ID App.Dalla pagina di gestione dell’app appena creata andiamo su Strumenti/Tool di Esplorazione e 
selezioniamo l’app creata e nelle opzioni Utente scegliamo il Token Utente e a seconda delle esigenze di progetto aggiungiamo 
tutte le autorizzazioni di accesso; un esempio sono le autorizzazioni per prendere tutti i dati dei Post.
Dopo aver cliccato Generate Access Token, autorizziamo l’accesso seguendo le indicazioni per Utente.
Copiamo l’Access Token per l’utilizzo nelle chiamate API. Nel nostro caso sarà:

https://graph.facebook.com/v7.0/me/feed?access_token=EAAIi8ZAbkTG4BAMyU5TNZBPa4ZAcaaU9O7XjWpVMYFLN8uwPCIYhXY5wgBSShMHEACZAMlcIPwzfxywa1nEBY7arBSiZAGCytCxnP5ZB9feoOVLR6YFKivGHVLUlYKpq7If1XsZCN3gA9ZC12ZCi9SgwEZB9owNuAuzp7Ur2KZCwcFOFEIy9GR9VAcZA&__activeScenarioIDs=%5B%5D&__activeScenarios=%5B%5D&debug=all&format=json&method=get&pretty=0&suppress_http_code=1&transport=cors&limit=1000&fields=comments{fields}";

I token di accesso dell' Utente generalmente sono di breve durata,tuttavia, abbiamo preferito avere un token di lunga nel nostro 
progetto.


### Controller

![Controller](https://user-images.githubusercontent.com/66262425/87711508-a894a080-c7a7-11ea-9773-64d8f6203a81.JPG)

---

### Model

![Model](https://user-images.githubusercontent.com/66262425/87711511-a894a080-c7a7-11ea-925c-6b33f5e4cca7.JPG)

IL package Model contiene diverse classi :

* Attachment
* Comment
* Feed
* CommentList
* Media 
* Image
* Post
* Stats

![ragionamento](https://user-images.githubusercontent.com/66262425/87711517-a9c5cd80-c7a7-11ea-9344-8f1f8bc57a95.JPG)

Inizialmente abbiamo creato la classe Feed che come andreamo a vedere incapsula vari tipi di dato. Nella classe Feed
troveremo un attributo List<Post> . Post è definita nella classe Post, qui troveremo 2 attributi, uno di questi è di tipo 
CommentList. Seguendo il ragionamento definisco CommentList in una classe con lo stesso nome.Nella classe CommentList
troveremo un attributo di tipo Attachment definito a sua volta da una una classe chiamata Attachment, in questa classe 
troviamo invece un attributo di tipo Media. Creo quindi la classe Media che mi genere un attributo di tipo Image.
In conclusione creo una classe Images.
Questo tipo di incapsulamento ha rispettato la tipologia di dato facebook.
Come si puo notare nell'immagine sopra dopo aver definito gli attributi si generano dei getter e dei setter 
che mi saranno utili in un'altra parte del progetto.
Dopo aver creato delle classi che mi gestiscono l' incapsulamento dei dati Facebook, creo una classe Stats che avrà 
specifici attributi:

* mediaComments: numero di commenti di tipo multimedia 

* hashtagComments: numero di hashtag nei commenti

* sumCommentsLength: numero che mi esprime la lunghezza di tutti i commenti  

* averageCommentsLength: numero che mi esprime una media della lunghezza dei commenti 

* minCommentsLength: numero che mi esprime la lunghezza minima di tutti i commenti  

* maxCommentsLength: numero che mi esprime la lunghezza massima di tutti i commenti

* emoticonComments: numeroo che mi esprime quante emoticon ci sono nei commenti

Infine abbiamo creato la classe Filter... 
	

---

### Repository

![Repository](https://user-images.githubusercontent.com/66262425/87711522-aa5e6400-c7a7-11ea-9924-9432e05b0074.JPG)

Qui salviamo la lista di soli commenti che abbiamo inizializzato nella classe Utils


---
### Service

![Service](https://user-images.githubusercontent.com/66262425/87711525-aaf6fa80-c7a7-11ea-9725-ee3791dbf93e.JPG)



---

### Utils

![Utils](https://user-images.githubusercontent.com/66262425/87711532-ac282780-c7a7-11ea-9a39-df693627bb22.JPG)

Il package Utils contiene diverse classi :

* FeedParser: in questa classe vado ad inizializzare gli attributi della classe Stats. Attraverso dei cicli annidati 
             vado a trovare ad ogni commento se ci sono degli hashtag, delle emoticon e aggiorno la 
             dimensione dell'attributo mediaComments. Si nota dalla lettura del codice che usiamo 
             una funzione specifica EmojiManager.containsEmoji(message) che mi permette di sapere se,
             ciò che stiamo analizzando, sia un emoticon oppure no. Per usare questa specifiche funzione abbiamo 
             dovuto aggiormare il pom.xml con una specifica dipendenza.

* RepoFilter :in questa classe andiamo a creare una Lista di commenti con ArrayList<Comment>
---

### Exception

Dato che il nostro progetto gestisce l'analisi dei Post è utile creare delle eccezioni:

* HashtagNotFoundException: eccezione che mi stampa in output un messaggio se nel FeedParsing 
non trova nessun hashtag 

* EmoticonNotFoundException: eccezione che mi stampa in output un messaggio se nel FeedParsing 
non trova nessun emoticon.


* FilterException 

---

### Tests

# Autori

[Andrea Langiotti](https://github.com/Langiott).

[Di Mauro Giuseppe](https://github.com/Giuseppe-Di-Mauro).

>Clicca per andare a visitare l'account GitHub 