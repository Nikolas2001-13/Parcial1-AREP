# Parcial 1 AREP

La aplicación recibirá en un campo la descripción de una ciudad, por ejemplo “London” para Londres 
y deberá mostrar la información del clima para esa ciudad. Para esto utilice el API gratuito de 
https://openweathermap.org/ (Puede crear una cuenta para obtener la llave para realizar consultas).
Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un 
caché que permita evitar hacer consultas repetidas al API externo. La petición 
debe pasar por su servicio web desplegado en Heroku, es decir desde su servicio 
en heroku se debe invocar el servicio web de clima. el usuario no sabrá que servicio estña usted 
invocando por detrás. Utilice el servicio "Current Weather Data".

## Empezando e Instalando

Entramos a la carpeta donde queremos guardar nuestro repositorio, en este caso Desktop

`$ cd Desktop`

Clonamos el repositorio en la carpeta

`$ git clone https://github.com/Nikolas2001-13/Parcial1-AREP`

Nos dirigimos a la carpeta que contiene el proyecto

`$ cd Parcial1-AREP`

Compilamos con maven

`$ mvn package`

Y por último corremos el programa

`$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.parcial.SparkWebApp"`

### Prerrequisitos
Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.
Tener conocimiento sobre Maven, HEROKU, GIT, Spark y GITHUB. 

## Despliegue en Heroku

[![Heroku App](http://heroku-shields.herokuapp.com/evening-scrubland-54477)](https://evening-scrubland-54477.herokuapp.com/)

## Correr las Pruebas

Para correr las pruebas del programa habrá que ejecutar el comando

`$ mvn test`

## Generar javadoc

Para generar el javadoc habrá que ejecutar el comando

`$ mvn javadoc:javadoc`

## Construido Con

* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - IDE

## Autor

* **Nikolás Bernal Giraldo** - [Nikolas2001-13](https://github.com/Nikolas2001-13) - Estudiante de la Escuela Colombiana de Ingeniería Julio Gravito

## Licencia

[LICENSE.md](http://www.gnu.org/licenses/gpl.html) 
