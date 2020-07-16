# Progetto Di Mauro Giuseppe & Langiotti Andrea  

![github-large](https://alumniunivpm.it/assets/img/logo/logo-UNIVPM.png)

Il progetto sfrutta le conoscenze della programmazione orientata ad oggetti per creare classi che ci permettono di gestire il data-set mediante un API REST-GET.
Per creare l'API rest è stato utilizzato Spring Boot un framework di Spring per la creazione di microservizi.
Tramite l'utilizzo del Rest Api (Get) ,con una repository, ci poniamo di ottenere dei post di Facebook dell' utente con lo scopo di analizzarli.Studiamo i post per:

-sapere se ci sono hastag nel post;

-sapere se ci sono emoticons;

-effettuare analisi statistiche sulla lunghezza dei testi.

# Software utilizzati

[Eclipse](https://www.eclipse.org/downloads/packages/release/mars/r/eclipse-ide-java-ee-developers) - ambiente di sviluppo integrato.

[Spring Boot](https://spring.io/guides/gs/spring-boot/) - framework per sviluppo di applicazioni Java.

[Maven](https://maven.apache.org/) - strumento di gestione progetti.

[PostMan](https://www.postman.com/) - strumento per testare il service.

[GitHub](https://github.com/) - strumento per il deposito del progetto 

[GitHub Desktop](https://desktop.github.com/) - strumento per la scritture del Readme

[StarUml](http://staruml.io/)- strumento per la creazione di diagrammi 


# Diagrammi Casi d'Uso

![Diagrammi Casi d'Uso]()


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

## Struttura package e classi

![Struttura package e classi](https://user-images.githubusercontent.com/66262425/87711527-aaf6fa80-c7a7-11ea-98bb-b2b249437ce4.JPG)

### Application 

![Application](https://user-images.githubusercontent.com/66262425/87711507-a7637380-c7a7-11ea-922c-d84b1ccf6aa9.JPG)

---

### Controller

![Controller](https://user-images.githubusercontent.com/66262425/87711508-a894a080-c7a7-11ea-9773-64d8f6203a81.JPG)
---

### Exception

![Exception]()
---

### Model

![Model](https://user-images.githubusercontent.com/66262425/87711511-a894a080-c7a7-11ea-925c-6b33f5e4cca7.JPG)
IL Package Model contiene diverse classi :

* Attachment
* Commet
* Feed
* Filter
* Media 
* MetaData
* Post
* Stats

![ragionamento](https://user-images.githubusercontent.com/66262425/87711517-a9c5cd80-c7a7-11ea-9344-8f1f8bc57a95.JPG)

Inizialmente abbiamo creato la classe......

### Repository

![Repository](https://user-images.githubusercontent.com/66262425/87711522-aa5e6400-c7a7-11ea-9924-9432e05b0074.JPG)
 

---
### Service

![Service](https://user-images.githubusercontent.com/66262425/87711525-aaf6fa80-c7a7-11ea-9725-ee3791dbf93e.JPG)


---

### Util

![Utils](https://user-images.githubusercontent.com/66262425/87711532-ac282780-c7a7-11ea-9a39-df693627bb22.JPG)

### Tests

![Tests]()

---

# Autori

[Andrea Langiotti](https://github.com/Langiott).

[Di Mauro Giuseppe](https://github.com/Giuseppe-Di-Mauro).

>Clicca per andare a visitare l'account GitHub 