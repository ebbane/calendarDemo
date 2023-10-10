<h1 align="center">Demo CalendarLibrary</h1>

  <div align="center">
    <strong>M2 Informatique</strong>
    <br />
    <a href="https://github.com/ebbane/calendarDemo"><strong>Explore le repo</strong></a>
    <br />
    <br />
    ·
    <a href="https://www.java.com/fr/">Java</a>
  </div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table des matières</summary>
  <ol>
    <li>
      <a href="#a-propos-du-projet">A propos du projet</a>
      <ul>
        <li><a href="#construit-avec">Construit avec</a></li>
      </ul>
    </li>
    <li>
      <a href="#commencer">Commencer</a>
      <ul>
        <li><a href="#prérequis">Prérequis</a></li>
        <li><a href="#installations">Installations</a></li>
      </ul>
    </li>
    <li>
      <a href="#commandes-utiles">Commandes utiles</a>
    </li>
    <li>
      <a href="#contact">Contact</a>
    </li>
  </ol>
</details>



## A propos du projet

Le but du projet est de mettre en place une application de démo pour démontrer le bon fonctionnement de la librairie de calendrier [CalendarLibrary](https://github.com/ebbane/calendarLibrary)

La librairie CalendarLibrary et ce projet sont un projet/TP du cours de Web Service

<p align="right">(<a href="#top">Retour en haut</a>)</p>


### Construit avec

Ce projet est construit avec les logiciels, et applications suivantes :

* [Docker](https://www.docker.com/)
* [Java](https://www.java.com/fr/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Github](https://github.com/)
* [IntelliJ IDEA](https://www.jetbrains.com/fr-fr/idea/)

<p align="right">(<a href="#top">Retour en haut</a>)</p>


## Commencer

Mise en place du projet en local pour les utilisateurs

### Prérequis

Ce projet nécéssite quelques installations de pré-lancement.

* [docker desktop](https://docs.docker.com/desktop/)

ou
* [Java 17](https://www.java.com/fr/download/)
* [Maven](https://maven.apache.org/install.html)


### Installations

Instructions à suivre (conseillé) pour le lancement du projet en local.

#### Avec docker

1. Lancer docker sur son environnement
2. Cloner le repo (ou dézipper le dossier)
   ```sh
   git clone git@github.com:ebbane/calendarDemo.git
   ```
3. Lancer la démo (via docker) :
   ```sh
   cd calendarDemo/docker
   docker-compose up -d
   ```

#### Avec maven 

1. Cloner le repo (ou dézipper le dossier)
   ```sh
   git clone git@github.com:ebbane/calendarDemo.git
   ```

2. Pour lancer la demo vous avez trois possibilitées : 1 - lancer l'application à partir du jar
   fourni (ressource/demo.jar), 2 - générer un nouveau jar, 3 - lancer l'application via spring

    1. ````sh
       cd resources
       java -jar demo.jar
       ````
   depuis demo
    2. ````sh
       mvn clean package
       java -jar target/demo.jar
       ````
    3. ```` sh
       mvn clean install -DskipTests=true
       mvn spring-boot:run
       ````


## Utilisation
Cette API REST met à disposition deux endpoint :
- /calendar/json
- /calendar/html

Ces deux endpoints ont deux paramètre : **year** et **month** 

Vous trouverez dans /ressources un exemple de collection Postman permettant de contacter l'API en local.
    


## Commandes utiles

1. Vérifier les images docker disponible
   ```sh
      docker images -a
    ```
3. Supprimer une image docker
   ```sh
      docker rmi <image_id>
    ```

<p align="right">(<a href="#top">Retour en haut</a>)</p>

## Contact

Ebbane DIET - ebbane.diet@ynov.com - support (À contacter si un problème survient au lancement)

Github : [@ebbane](https://github.com/ebbane)

<p align="right">(<a href="#top">Retour en haut</a>)</p>
