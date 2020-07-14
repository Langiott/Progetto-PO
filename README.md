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

![Struttura package e classi](https://user-images.githubusercontent.com/66262425/87336222-c95bbc80-c541-11ea-8193-1d9f94eaa99c.JPG)
---

### Application 

![Application](https://user-images.githubusercontent.com/66262425/87336024-8994d500-c541-11ea-9f45-ed7c7eb03ca4.JPG)

---

### Controller

![Controller](https://user-images.githubusercontent.com/66262425/87336171-b8ab4680-c541-11ea-99fd-2841b287127d.JPG)
---

### Exception

![Exception]()
---

### Model

![Model](https://user-images.githubusercontent.com/66262425/87453466-d096cf00-c602-11ea-9a0a-7e4dd66cd9d5.JPG)

IL Package Model contiene diverse classi :

* Attachment
* Commet
* Feed
* Filter
* Media 
* MetaData
* Post
* Stats

![PARTENZA](https://user-images.githubusercontent.com/66262425/87453481-d4c2ec80-c602-11ea-88d3-46da403710cc.JPG)

Inizialmente abbiamo creato la classe Feed contenete un attributo di tipo List<Post> (definito ogni attributo generiamo un getter e un setter). 
Defininimo Post nella classe Post che contiene due attributiuno del quali è un List<Commet>. 
A sua volta Commet è definito da una classe Commit avente 3 attributi tra cui uno di tipo Attachment. A fior di logica definiamo Attachment con la classe Attachment avente 3 
attributi, uno di questi è di tipo Media. 
In conclusione definiamo Media con la classe Media.Questa classe contiene 3 attributi, questa volta oltre a generare dei setter , dei getter e toString() creaiamo altri metodi:

* equals() :metodo che ci restituisce true o false a seconda dalle condizioni ben definite 

* hashcode() : definito il metodo equals definiamo anche questo metodo per non incorrere ad eventuali errori

Ora definiamo altre classi : MetaData e Stats. Infine definiamo una interfaccia Filter<E,T>.


### Repository

![Repository](https://user-images.githubusercontent.com/66262425/87336195-c06aeb00-c541-11ea-9b6d-5e7b00c80f97.JPG)

Classe che mi va a definire due metodo che mi permettono di salvare il feed 
---
### Service

![Service](https://user-images.githubusercontent.com/66262425/87336201-c4970880-c541-11ea-8b21-6b110ac3b292.JPG)

Classe che mi fa restituisce molti tipi di dato attraverso diversi metodi.



---

### Utils

![Utils](https://user-images.githubusercontent.com/66262425/87453488-d7254680-c602-11ea-8275-4f8cb879d228.JPG)
---

### Tests

![Tests](https://user-images.githubusercontent.com/66262425/87335561-ce6c3c00-c540-11ea-9769-7dc5f6993ca5.JPG)

---

# Autori

[Andrea Langiotti](https://github.com/Langiott).

[Di Mauro Giuseppe](https://github.com/Giuseppe-Di-Mauro).

>Clicca per andare a visitare l'account GitHub 
