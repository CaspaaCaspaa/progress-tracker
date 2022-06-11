# progress-tracker

## Spis treści
[Opis działania](#opis-dzialania)
[Instalacja](#instalacja)
[Komendy](#komendy)
[Przykład użycia](#przyklad-uzycia)
[Licencja](#licencja)
[Zespół deweloperski](#zespol-deweloperski)

## Opis działania
Progress tracker pozwoli na zapisanie godzin Twojej pracy, zwróci raport Twojej pracy w całości lub według Twoich filtrów. 

Funkcjonalności programu: 
-zapisywanie godzin pracy,
-tworzenie listy wszystkich zapisanych rekordów,
-tworzenie raportów zapisanych rekordów w odniesieniu do okresu jaki obejmuje raport (dzisiaj, wczoraj, ten tydzień - początek tygodnia zawsze wskazujący na poniedziałek, 7 ostatnich dni, ten rok, zakres podanych dat),
-wyświetlanie dziewięciu ostatnich zapisanych rekordów,
-wyświetlanie aktualnie zaczętego pomiaru zapisu,
-wygenerowanie wykresów dotyczących Twojej pracyw formie barchart'u lub piechart'u

## Instalacja
Uruchomienie z wiersza poleceń.

## Komendy
Wyświetlanie pełnej listy komend
```
tracker -h
```
Rozpoczęcie pomiaru czasu pracy
```
tracker -start
```
Zakończenie pomiaru czasu pracy
```
tracker -stop
```
Wyświetlenie 9 ostatnich pozycji zapisanego pomiaru
```
tracker -last
```
Wyświetlenie listy wszystkich wpisów
```
tracker -list
```
Wyświetlenie aktualnie zaczętego pomiaru zapisu 
```
tracker -current
```
Powrót do kontunuacji pracy nad ostatnim 
```
tracker -continue
```
Powrót do kontunuacji pracy nad wskazanym rekordem po id 
```
tracker -continue.id
```


## Przykład użycia

Przykladowy Plik: PrzykladowyPlik

Format pliku tekstowego: 
NazwaProjektu, NazwaZadania, CzasRozpoczecia, CzasZakonczenia

Format daty(CzasRozpoczecia, CzasZakonczenia)
dd-MM-yyyy hh:mm:ss	02-1-2018 06:07:59

```
$ tracker start "nazwa projektu" "nazwa czynności" 10:00 11.06.2022

```
```
$ tracker stop "nazwa projektu" "nazwa czynności" 10:30 11.06.2022
```
## Licencja
Ten projekt jest na licencji MIT.

## Zespół deweloperski
https://github.com/anngum
https://github.com/CaspaaCaspaa/
https://github.com/CodeWithN
https://github.com/KarasJava
https://github.com/kasiamadera
https://github.com/maliszagata
