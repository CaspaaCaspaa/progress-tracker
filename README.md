# progress-tracker

# Spis treści
[Opis działania](#opis-dzialania)  
[Instalacja](#instalacja)  
[Komendy](#komendy)  
[Przykład użycia](#przyklad-uzycia)  
[Licencja](#licencja)  
[Zespół deweloperski](#zespol-deweloperski)  

## Opis działania
Progress tracker pozwala na zapisanie godzin Twojej pracy. Jego funkcjonalnością jest również zwracanie raportów dotyczący dni i godzin Twojej pracy w całości lub według podanych filtrów. 

### Funkcjonalności programu:  
-zapisywanie godzin pracy,  
-tworzenie listy wszystkich zapisanych rekordów,  
-tworzenie raportów zapisanych rekordów w odniesieniu do okresu jaki obejmuje raport (dzisiaj, wczoraj, ten tydzień - początek tygodnia zawsze wskazujący na poniedziałek, 7 ostatnich dni, ten rok, zakres podanych dat),  
-wyświetlanie dziewięciu ostatnich zapisanych rekordów,  
-wyświetlanie aktualnie zaczętego pomiaru zapisu,  
-wygenerowanie wykresów dotyczących Twojej pracyw formie barchart'u lub piechart'u  

Format pliku tekstowego .txt   
Sposób zapisu poszczególnych rekordów w pliku:  
NazwaProjektu, NazwaZadania, CzasRozpoczecia, CzasZakonczenia

## Instalacja
Uruchomienie z wiersza poleceń:   
Upewnij się, że jesteś w folderze w którym znajduje się tracker.
```
./tracker.sh
```

## Komendy
Wyświetlanie pełnej listy komend
```
tracker h
```
Rozpoczęcie pomiaru czasu pracy
```
tracker start "Nazwa projektu" "Wykonywana czynność" 
```
Zakończenie pomiaru czasu pracy
```
tracker stop
```
Wyświetlenie 9 ostatnich pozycji zapisanego pomiaru wraz z identyfikatorem
```
tracker last 
```
Wybór pozycji po identyfikatorze pozwalający na rozpoczęscie pracy przy wskazanej pozycji
```
tracker last "identyfikator"
```
Wyświetlenie listy wszystkich wpisów
```
tracker list 
```
Wyświetlanie raportu
```
tracker raport "zakres którego dotyczy"
```
Wbudowane zakresy obowiązywania raportu:  
Raport za ten tydzień (this-week) dotyczył będzie zakresu czasu zaczynając od poniedziałku.  
Raport dotyczący konkretnego okresu czasu należy konstruować poprzez podanie daty rozpoczęcia raportu oraz daty zakończenia okresu raportu w formacie dd-mm-yyyy  
```
tracker raport today  
tracker raport yesterday
tracker raport this-week
tracker raport last-7-days
tracker raport this-year
tracker raport "dd-mm-yyyy" : "dd-mm-yyyy"
tracker raport "nazwa projektu"
```
Wyświetlenie aktualnie zaczętego pomiaru
```
tracker current
```
Powrót do kontunuacji pracy nad ostatnim 
```
tracker continue
```
Powrót do kontunuacji pracy nad wskazanym rekordem po id 
```
tracker continue.id "Numer id"
```
Opcja trakera wskazująca na konkretny plik
```
tracker -f "nazwa pliku"
```

## Przykład użycia

Rozpoczęcie pomiaru czasu pracy
```
$ tracker start Nazwa projektu Tworzenie grafiki

```
Raporty ze wstazaniem na różne wyznaczniki czasu
```
tracker raport today
tracker raport last-7-days
tracker raport 01-01-2022 : 12.06.2022 
```
Wykorzystanie funkcji last
```
tracker last
tracker last 1
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
