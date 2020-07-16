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

![Diagrammi Casi d'Uso](https://user-images.githubusercontent.com/66262425/87339217-949e3400-c546-11ea-9cf1-4458a86e3ce4.JPG)


# Struttura

![pacchetto]()

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

![Struttura package e classi]()

### Application 

![Application]()

---

### Controller

![Controller]()
---

### Exception

![Exception]()
---

### Model

![Model]()
IL Package Model contiene diverse classi :

* Attachment
* Commet
* Feed
* Filter
* Media 
* MetaData
* Post
* Stats

![ragionamento]()

Inizialmente abbiamo creato la classe......

### Repository

![Repository]()
 

---
### Service

![Service]()


---

### Utils

![Utils]()

### Tests

![Tests]()

---

# Autori

[Andrea Langiotti](https://github.com/Langiott).

[Di Mauro Giuseppe](https://github.com/Giuseppe-Di-Mauro).

>Clicca per andare a visitare l'account GitHub 
