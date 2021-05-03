## Dentist app

Rakendus võimaldab kasutajatel aega registreerida hambaarsti juurde. Ette on antud valik hambaarstidest ja võimalus valida omale meelepärast kuupäeva ja aega. Lisaks on võimalus kõikide registreeringute vaatamiseks ja kustutamiseks.  
Antud on kaks vaadet: registreerimine ja visiidiaegade loend. Loendisse ilmuvad detailselt kõik kasutaja lisatud ajad 

## Programmi jooksutamine

(IntelliJ IDEA)  
Projekt tuleb importida Maveni projektina, valikust pom.xml. 
Programmi saab käivitada failiga
~~~
src/main/java/com.cgi.dentistapp/DentistAppApplication
~~~
Rakendus on ligipääsetav aadressilt http://localhost:8080/.

## Isiklik lahendusprotsess
Tegemata jäid punkti 3.2, 3.3 ja 4.1. Kokku läks umbes 15 tundi.

#### Etapp 1
Kuna varasemalt pole Springiga kokku puutunud, pidin veidi uurima selle raamistiku kohta ja ka h2 andmebaasimootori kohta. Esines probleeme kindlate andmetüüpide salvestamisega andmebaasi.
Arvestades materjalide lugemist, läks siin kokku umbes 5 tundi.

#### Etapp 2
Sellega väga probleeme ei esinenud.

#### Etapp 3
Siin jõudsin vaid esimese punktiga valmis, milleks on kirjete kustutamine. Sai korralikult Thymeleafi ja Springi dokumentatsiooni loetud ja ka erinevaid lahendusi proovitud. Otseselt midagi väga rasket ei olnud, oli vaja vaid õiget viisi andmete edastamiseks <em>Controller</em>'isse.


#### Etapp 5
Natuke tegin kujundust kasutades Bootstrapi.