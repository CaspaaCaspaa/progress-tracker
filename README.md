# progress-tracker

## Spis treści
[Opis działania](#opis-dzialania)
[Instalacja](#instalacja)
[Komendy](#komendy)
[Przykład użycia](#przyklad-uzycia)
[Zespół deweloperski](#zespol-deweloperski)

## Opis działania
Progress tracker pozwoli na zapisanie godzin Twojej pracy. 
Funkcjonalności programu: 
-zapisywanie godzin pracy,
-tworzenie listy wszystkich zapisanych rekordów,
-tworzenie raportów zapisanych rekordów w odniesieniu do okresu jaki obejmuje raport (dzisiaj, wczoraj, ten tydzień - początek tygodnia zawsze wskazujący na poniedziałek, 7 ostatnich dni, ten rok, zakres podanych dat),
-

## Instalacja


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
-list
```
Wyświetlenie aktualnie zaczętego pomiaru zapisu 
```
-current
```
Powrót do kontunuacji pracy nad ostatnim 
```
-continue
```

-continue.id



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

## Zespół deweloperski
https://github.com/CaspaaCaspaa/
https://github.com/maliszagata
https://github.com/CodeWithN
https://github.com/KarasJava
https://github.com/anngum
https://github.com/kasiamadera
